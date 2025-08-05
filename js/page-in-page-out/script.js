// Número de quadros de página na memória física
const memoryFrames = Array(4).fill(null);

function loadPage(pageNumber) {
    const memoryContainer = document.getElementById('memoryContainer');
    const pageIndex = memoryFrames.indexOf(pageNumber);

    if (pageIndex === -1) {  // Página não está na memória física
        const emptySlot = memoryFrames.indexOf(null);

        if (emptySlot !== -1) {
            // Page-in: carrega a página no primeiro slot livre
            memoryFrames[emptySlot] = pageNumber;
        } else {
            // Page-out e Page-in: remove a primeira página e carrega a nova
            memoryFrames.shift();  // Remove a página mais antiga (FIFO)
            memoryFrames.push(pageNumber);  // Adiciona a nova página
        }
        renderMemory();
        alert(`Page-in: Página ${pageNumber} carregada na memória.`);
    } else {
        alert(`A página ${pageNumber} já está na memória.`);
    }
}

function renderMemory() {
    const memoryContainer = document.getElementById('memoryContainer');
    memoryContainer.innerHTML = '';

    memoryFrames.forEach((page, index) => {
        const pageDiv = document.createElement('div');
        pageDiv.className = 'page';
        if (page) {
            pageDiv.classList.add('in-memory');
            pageDiv.textContent = `Página ${page}`;
        } else {
            pageDiv.textContent = 'Vazio';
        }
        memoryContainer.appendChild(pageDiv);
    });
}

renderMemory();
