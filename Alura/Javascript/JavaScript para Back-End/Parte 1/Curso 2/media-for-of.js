const notas = [10,6.5,8,7.5];

let somaDasNotas = 0;

for(let nota of notas){
    somaDasNotas += nota;
}
media = somaDasNotas/notas.length;
console.log(media);
