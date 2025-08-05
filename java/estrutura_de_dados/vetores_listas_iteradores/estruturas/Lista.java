package estruturas;

public class Lista {

    public No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        this.inicio.anterior = no;

        no.proximo = this.inicio;
        this.inicio = no;
    }

    public void listarElementos(){
        Iterador iterador = this.getIterador();
    }

    public void mostrarNos() {
        Iterador iterador = this.getIterador();
        
        while (iterador.getAtual() != null) {
            iterador.display();
        }
    }

    public void remover(int valor) {
        No noAux = this.inicio;

        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        noAux.anterior.proximo = noAux.proximo;
        noAux.proximo.anterior = noAux.anterior;
    }

    // Getter
    public Iterador getIterador() {
        return new Iterador(this, this.inicio);
    }

    // Inserir no final da lista
    public void inserirNoFinal(int valor){
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        } 
        
        No aux = this.inicio;
        while (aux.proximo != null) {
            aux = aux.proximo;
        }
        aux.proximo = no;
    }

    // Método que retorna o número de nós da lista
    public void numeroDeNos(){
        int c = 1;

        if (this.inicio == null){
            System.out.println("0");
            
        } else {
            while (this.inicio.proximo != null) {
                c++; 
                this.inicio = this.inicio.proximo;
            }
            System.out.println(c);
        }
    }

    // Adicionar tamanho a lista


    // Insere um novo nó com novoValor após o primeiro nó que contém o valor informado
    public void inserirAposValorInformado(int valor, int novoValor) {
        No atual = inicio;

        // Procura o nó com o valor desejado
        while (atual != null && atual.dado != valor) {
            atual = atual.proximo;
        }

        // Se encontrou o nó, insere depois dele
        if (atual != null) {
            No novoNo = new No(novoValor);
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        } else {
            System.out.println("Valor " + valor + " nao encontrado na lista.");
        }
    }
}
