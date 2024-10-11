const botaoOrdenar = document.getElementById("btnOrdenarPorPreco")

botaoOrdenar.addEventListener("click",ordenarLivrosPorPreco)

function ordenarLivrosPorPreco() {
    livrosOrdenados = livros.sort((a,b)=> a.preco - b.preco)
    mostrarLivrosNaTela(livrosOrdenados)
}