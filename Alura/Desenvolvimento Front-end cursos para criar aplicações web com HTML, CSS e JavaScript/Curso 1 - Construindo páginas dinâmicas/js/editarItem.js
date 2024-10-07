import { criarTextoDataHora } from "./criarTextoDataHora.js"

export const editarItem = (elemento) =>{
    let novoItem = prompt("Digite o novo nome do item")
    if(novoItem !== null && novoItem.trim() !== ""){
        const itemTextoAtualizado = elemento.querySelector("#item-titulo")
        itemTextoAtualizado.textContent = novoItem
        const estavaComprado = elemento.querySelector(".input-checkbox").checked
        if(estavaComprado){
            elemento.querySelector(".input-checkbox").checked = true
            elemento.querySelector(".checkbox-customizado").classList.add("checked")
            itemTextoAtualizado.style.textDecoration = "line-through"
        }
        const dataDeCriacao = elemento.querySelector(".texto-data");
        console.log(dataDeCriacao)
        dataDeCriacao.textContent = criarTextoDataHora();
        console.log(dataDeCriacao)
    }
}