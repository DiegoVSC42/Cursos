const html = document.querySelector("html")
const focoBt = document.querySelector(".app__card-button--foco")
const curtoBt = document.querySelector(".app__card-button--curto")
const longoBt = document.querySelector(".app__card-button--longo")
const imagem = document.querySelector(".app__image")
const titulo = document.querySelector(".app__title")
const botoes = document.querySelectorAll(".app__card-button")
const musicBt = document.querySelector("#alternar-musica")
const startPauseBt = document.querySelector("#start-pause")
const textoBotao = document.querySelector("#start-pause span")
const imagemBotao = document.querySelector(".app__card-primary-butto-icon")
const tempoNaTela = document.querySelector("#timer")
const music = new Audio("/sons/luna-rise-part-one.mp3")
const play = new Audio("/sons/play.wav")
const pause = new Audio("/sons/pause.mp3")
const beep = new Audio("/sons/beep.mp3")
music.loop = true;

let tempoDecorridoEmSegundos = 1500
let intervaloId = null


focoBt.addEventListener("click", () => {
    tempoDecorridoEmSegundos = 1500
    alterarContexto("foco")
    focoBt.classList.add("active")
})
curtoBt.addEventListener("click", ()=>{
    tempoDecorridoEmSegundos = 300
    alterarContexto("descanso-curto")
    curtoBt.classList.add("active")
})
longoBt.addEventListener("click", () => {
    tempoDecorridoEmSegundos = 900
    alterarContexto("descanso-longo")
    longoBt.classList.add("active")
})

function alterarContexto(contexto){
    mostrarTempoNaTela()
    html.setAttribute("data-contexto",contexto)
    imagem.setAttribute("src",`./imagens/${contexto}.png`)
    botoes.forEach((botao)=>{
        botao.classList.remove("active")
    })
    switch (contexto) {
        case "foco":
            titulo.innerHTML = 
            `
            Otimize sua produtividade,<br>
                <strong class="app__title-strong">mergulhe no que importa.</strong>
            `
            break
        case "descanso-curto":
            titulo.innerHTML = 
            `
            Que tal dar uma respirada?<br>
                <strong class="app__title-strong">Faça uma pausa curta!</strong>
            `
            break
        case "descanso-longo":
            titulo.innerHTML = 
            `
            Hora de voltar à superfície.<br>
                <strong class="app__title-strong">Faça uma pausa longa.</strong>
            `
            break
        default:
            break
    }

}

musicBt.addEventListener("change",()=>{
    if(music.paused){
        music.play()
    }else{
        music.pause()
    }
})

function contagemRegressiva() {
    if (tempoDecorridoEmSegundos <= 0){
        zerar()
        beep.play()
        alert("Tempo finalizado!")
        return
    }
    mostrarTempoNaTela()
    tempoDecorridoEmSegundos -= 1
    console.log(tempoDecorridoEmSegundos)
}

startPauseBt.addEventListener("click",iniciarOuPausar)

function iniciarOuPausar(){
    if(intervaloId){
        pause.play()
        zerar() 
        return
    }
    play.play()
    textoBotao.textContent = "Pausar"
    imagemBotao.setAttribute("src", "/imagens/pause.png")
    intervaloId = setInterval(contagemRegressiva,1000)
}

function zerar(){
    clearInterval(intervaloId)
    textoBotao.textContent = "Começar"
    imagemBotao.setAttribute("src", "/imagens/play_arrow.png")
    intervaloId = null
}

function mostrarTempoNaTela(){
    const tempo = new Date(tempoDecorridoEmSegundos*1000)
    const tempoFormatado = tempo.toLocaleTimeString('pt-Br',{minute:"2-digit",second: "2-digit"})
    tempoNaTela.textContent = tempoFormatado
}

mostrarTempoNaTela()