var text = document.getElementById('texto')
var speed = document.getElementById('velocidade')
var textWrite = "Texto apara testearas dasdaskjghs xc vqweruwe oi"
let index = 1
let speedValue = 300 / speed.value 
writeText()
function writeText() {
    text.innerText = textWrite.slice(0, index)
    index++
    if (index > textWrite.length){
        index = 1
    }
    setTimeout(writeText, speedValue)
}

speed.addEventListener('input', function(e){
    speedValue = 300 / e.target.value
})

