let totalCirculosClicados = 0

function criarCirculo() {
    let circulo = document.createElement("div");
    circulo.setAttribute("class", "circulo");
    
    let x = Math.floor(Math.random() * 700);
    let y = Math.floor(Math.random() * 500);

    circulo.setAttribute("style", "left:" + x + "px; top:" + y + "px;");
    circulo.onclick = function() { 
        clicar(circulo); 
    };
    document.body.appendChild(circulo);
}

function clicar(objeto) {
    document.body.removeChild(objeto);

    totalCirculosClicados++
    let total = document.getElementById('total')
    total.innerHTML = "Total de cliques: " + totalCirculosClicados
}

function comecarJogo() {
    setInterval(criarCirculo, 1000);
}