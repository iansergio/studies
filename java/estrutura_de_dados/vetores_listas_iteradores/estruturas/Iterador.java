package estruturas;

public class Iterador {
    
    Lista lista;
    No atual;

    public Iterador(Lista lista, No atual) {
        this.lista = lista;
        this.atual = atual;
    }

    public Boolean haProximo() {
        return this.atual.proximo != null;
    }

    public Boolean haAnterior() {
        return this.atual.anterior != null;
    }

    public void proximo() {
        this.atual = atual.proximo;
    }

    public int getDadoAnterior() {
        return this.atual.anterior.dado;
    }

    public int getDadoProximo() {
        return this.atual.proximo.dado;
    }

    public int getDado() {
        return this.atual.dado;
    }

    public No getAtual() {
        return this.atual;
    }

    public void resetar() {
        this.atual = this.lista.inicio;
    }

    public void display() {
        if (this.haAnterior()) {
            System.out.print("Anterior -> " + this.getDadoAnterior() + " | ");
        }

        System.out.print("No " + this.getDado());
        
        if (this.haProximo()) {
            System.out.println(" | Proximo -> " + this.getDadoProximo());
        }
        System.out.println("");
        this.proximo();
    }

    // Inserir após o atual
    public void inserirAposAtual(int dado) {
        No novo = new No(dado);
        
        novo.anterior = atual;
        novo.proximo = atual.proximo;
        
        if (atual.proximo != null) {
            atual.proximo.anterior = novo;
        }
        
        atual.proximo = novo;
    }
    
    // Remover após o atual
    public void removerAposAtual() {
        if (atual.proximo != null) {
            
            No remover = atual.proximo;
            
            atual.proximo = remover.proximo;

            if (remover.proximo != null) {
                remover.proximo.anterior = atual;
            }
        }
    }
    
    // Inserir antes do atual
    public void inserirAntesAtual(int dado) {
        No novo = new No(dado);
        novo.proximo = atual;
        novo.anterior = atual.anterior;
    
        if (atual.anterior != null) {
            atual.anterior.proximo = novo;
        } else {
            lista.inicio = novo; 
        }
    
        atual.anterior = novo;
    }

    // Remover antes do atual
    public void removerAntesAtual() {
        if (atual.anterior != null) {
            No remover = atual.anterior;
            atual.anterior = remover.anterior;
            if (remover.anterior != null) {
                remover.anterior.proximo = atual;
            } else {
                lista.inicio = atual;
            }
        }
    }
    
}
