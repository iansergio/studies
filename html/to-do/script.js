// Função das abas (pessoal e profissional)
function openTab(evt, tabName) {
    let tabContent = document.getElementsByClassName('tabContent')
    let i;
    for (i = 0; i < tabContent.length; i++) {
        tabContent[i].style.display = "none"
        tabContent[i].classList.add = "active"
    }
    let tabLinks = document.getElementsByClassName('tabLinks')
    for (i = 0; i < tabLinks.length; i++) {
        tabLinks[i].classList.remove("active")
    }
    let tab = document.getElementById(tabName)
    if (tab) {
        tab.style.display = "block";
        evt.currentTarget.classList.add("active")
    } else {
        console.error("Erro " + tabName + "' nao foi encontrada!")
    }
}

// TO DO LIST

// CRUD
// CREATE
    
// READ
// UPDATE
// DELETE
