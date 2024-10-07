const campoEntrada = document.getElementById("input-item")
const botaoSalvar = document.getElementById("button-item")

botaoSalvar.addEventListener("click",adicionarItem)


function adicionarItem(evento) {
    evento.preventDefault()
    const listaDeItens = document.getElementById("item-list") 

    const itemDaLista = document.createElement("li")
    itemDaLista.classList.add("item")

    const containerBotoes = document.createElement("div")
    containerBotoes.classList.add("buttons")

    const botaoDeletar = document.createElement("button")
    botaoDeletar.classList.add("delete-button")

    const botaoEditar = document.createElement("button")
    botaoEditar.classList.add("edit-button")

    listaDeItens.appendChild(itemDaLista)
    listaDeItens.appendChild(containerBotoes)
    
    containerBotoes.appendChild(botaoDeletar)
    containerBotoes.appendChild(botaoEditar)
    
}