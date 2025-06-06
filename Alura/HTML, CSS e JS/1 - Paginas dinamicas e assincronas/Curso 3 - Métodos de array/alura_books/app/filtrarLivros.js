const botoes = document.querySelectorAll(".btn");

botoes.forEach((btn) => btn.addEventListener("click", filtrarLivros));

function filtrarLivros() {
  const elementoBtn = document.getElementById(this.id);
  const categoria = elementoBtn.value;
  let livrosFiltrados =
    categoria === "disponivel"
      ? filtrarPorQuantidade()
      : filtrarPorCategoria(categoria);
  mostrarLivrosNaTela(livrosFiltrados);
  if (categoria === "disponivel") {
    const valorTotal = somarValoresDosLivros(aplicaDesconto(livrosFiltrados))
    exibirValorTotalDosLivrosDisponiveisNaTela(valorTotal)
  }
}

function filtrarPorCategoria(categoria) {
  return livros.filter((livro) => livro.categoria == categoria);
}

function filtrarPorQuantidade() {
  return livros.filter((livro) => livro.quantidade > 0);
}

function exibirValorTotalDosLivrosDisponiveisNaTela(valorTotal){
    elementoLivrosDisponiveis.innerHTML = 
    `
    <div class="livros__disponiveis">
      <p>Todos os livros disponíveis por R$ <span id="valor">${valorTotal}</span></p>
    </div>
    `;
}