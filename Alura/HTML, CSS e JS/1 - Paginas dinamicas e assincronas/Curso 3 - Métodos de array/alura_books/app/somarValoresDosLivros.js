function somarValoresDosLivros(livros){
    // console.log(livros.reduce((acc,livro) => acc+livro.preco,0).tofixed(2))
    return (livros.reduce((acc,livro) => acc+livro.preco,0)).toFixed(2)
}