const alunos = ["Ana","Marcos","Maria","Mauro"];
const medias = [7,4.5,8,7.5];

const reprovados = alunos.filter((_,indice)=> medias[indice] < 5 ? true : false);

console.log(reprovados);