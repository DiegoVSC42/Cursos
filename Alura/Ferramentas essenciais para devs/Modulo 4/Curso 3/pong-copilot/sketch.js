let bolaImagem;
let barraJogador;
let barraComputador;
let fundo1;
let fundo2;
let quicarSom;
let golSom;

let pontosJogador = 0;
let pontosComputador = 0;

class Raquete {
    constructor(x) {
        this.x = x;
        this.y = height / 2;
        this.largura = 10;
        this.altura = 50;
        
    }
    update() {
        if (this.x < width / 2) {
            if (keyIsDown(UP_ARROW)) {
                this.y -= 5;
            }
            if (keyIsDown(DOWN_ARROW)) {
                this.y += 5;
            }
        } else {
            let velocidadeComputador = 3;
            if (bola.y < this.y + this.altura / 2) {
                this.y -= velocidadeComputador;
            } else if (bola.y > this.y + this.altura / 2) {
                this.y += velocidadeComputador;
            }
        }
        //limitar a raquete para nao sair da tela
        this.y = constrain(this.y, 0, height - this.altura);
    }

    desenha() {
        //se for jogador desenha a barra do jogador se nao desenha a do computadoR
        if (this.x < width / 2) {
            image(barraJogador, this.x, this.y, this.largura, this.altura);
        } else {
            image(barraComputador, this.x, this.y, this.largura, this.altura);
        }
        
        // fill(255);
        // rect(this.x, this.y, this.largura, this.altura);
    }
}

class Bola {
    constructor() {
        this.diametro = 25;
        this.raio = this.diametro / 2;
        this.angulo = 0;
        this.reset();
    }

    reset() {
        this.x = width / 2;
        this.y = height / 2;
        const velocidadeMaxima = 5;
        this.velocidadeX = Math.random() * velocidadeMaxima * 2 - velocidadeMaxima;
        this.velocidadeY = Math.random() * velocidadeMaxima * 2 - velocidadeMaxima;
        this.angulo = 0;
    }

    update() {
        this.x += this.velocidadeX;
        this.y += this.velocidadeY;

        //rotaciona de acordo com a velocidade em x e y 
        this.angulo += this.velocidadeX / 30;

        if (this.x < this.raio || this.x > width - this.raio) {
            if (this.x < this.raio) {
                pontosComputador++;
            } else {
                pontosJogador++;
            }
            golSom.play();
            falaPontos();
            this.reset();
        }

        if (this.y < this.raio || this.y > height - this.raio) {
            this.velocidadeY *= -1;
        }

        if (
            colisaoCirculoRetangulo(this.x, this.y, this.raio, jogador.x, jogador.y, jogador.largura, jogador.altura) ||
            colisaoCirculoRetangulo(this.x, this.y, this.raio, computador.x, computador.y, computador.largura, computador.altura)
        ) {
            quicarSom.play();
            this.velocidadeX *= -1;
            this.velocidadeX *= 1.1;
            this.velocidadeY *= 1.1;
        }
    }

    desenha() {
        //rotaciona antes de desenhar
        push();
        translate(this.x, this.y);
        rotate(this.angulo);
        imageMode(CENTER);
        image(bolaImagem, 0,0,this.diametro,this.diametro);
        pop();
    }
}

function colisaoCirculoRetangulo(cx, cy, raio, x, y, largura, altura) {
    if (cx + raio < x || cx - raio > x + largura) {
        return false;
    }

    if (cy + raio < y || cy - raio > y + altura) {
        return false;
    }
    return true;
}

const larguraTela = 800;
const alturaTela = 400;
let bola;
let jogador;
let computador;

function preload() {
    bolaImagem = loadImage('bola.png');
    barraJogador = loadImage('barra01.png');
    barraComputador = loadImage('barra02.png');
    fundo1 = loadImage('fundo1.png');
    fundo2 = loadImage('fundo2.png');
    quicarSom = loadSound('bounce.wav');
    golSom = loadSound('win.wav');
}

function setup() {
    createCanvas(larguraTela, alturaTela);

    bola = new Bola();
    jogador = new Raquete(30);
    computador = new Raquete(width - 40);
}

function draw() {
    image(fundo1, 0, 0, larguraTela, alturaTela);
    bola.update();
    bola.desenha();
    jogador.update();
    jogador.desenha();
    computador.update();
    computador.desenha();
}

function falaPontos(){
    //use speechapi
    let voz = new SpeechSynthesisUtterance();
    voz.lang = 'pt-BR';
    voz.text = `Jogador ${pontosJogador}  Computador ${pontosComputador}`;
    speechSynthesis.speak(voz);


}
