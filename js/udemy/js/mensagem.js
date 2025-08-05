const appInput = document.querySelector('#app input')
const appButton = document.querySelector('#app button')
const appUl = document.querySelector('#app ul')

let lista = JSON.parse(localStorage.getItem('lista')) || []

let i = 0;
function mostrar(){
    appUl.innerHTML = ''
    lista.forEach(element => {
        let li = document.createElement('li')
        let liText = document.createTextNode(element)
        let liA = document.createElement('a')
        let i = lista.indexOf(element)
        liA.setAttribute('onclick', 'deletar('+ i +')')
        liA.setAttribute('href', '#')
        let liAText = document.createTextNode("Excluir")
        liA.appendChild(liAText)
        li.appendChild(liText)
        li.appendChild(liA)
        appUl.appendChild(li)
    });
}

function adicionar(){
    if (appInput.value == '') {
        alert("Digite uma tarefa")
    } else {
        let liText = appInput.value
        lista.push(liText)
        appInput.value = ''
        mostrar()
        guardarLista()
    }
}

function deletar(i){
    lista.splice(i, 1)
    mostrar()
    guardarLista()
}

function guardarLista(){
    localStorage.setItem('lista', JSON.stringify(lista))
}
