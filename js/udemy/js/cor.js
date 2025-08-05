meuStorage = localStorage

function setarCor() {
    body.style.backgroundColor = localStorage.getItem("hexAtual")
    valorHex.textContent = localStorage.getItem("hexAtual")
}

const body = document.querySelector('body')
const hexValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "a", "b", "c", "d", "e", "f"]
const valorHex = document.querySelector('#valor-hex')

function gerar(){
    let hex = "#"
    
    for (let i = 0; i <6; i++){
        const i = Math.floor(Math.random() * hexValues.length)
        hex = hex + hexValues[i]
    }
    valorHex.textContent = hex
    body.style.backgroundColor = hex;
    localStorage.setItem("hexAtual", hex)
}