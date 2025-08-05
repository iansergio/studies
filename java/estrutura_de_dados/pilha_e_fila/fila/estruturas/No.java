package fila.estruturas;

import fila.app.Documento;

public class No {

    public Documento dado;

    public No proximo;
    public No anterior;

    public No(Documento documento) {
        this.dado = documento;
        this.proximo = null;
        this.anterior = null;
    }
}
