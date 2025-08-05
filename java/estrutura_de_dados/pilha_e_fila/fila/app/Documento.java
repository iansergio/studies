package fila.app;

import fila.estruturas.Fila;
import fila.estruturas.No;

public class Documento {

    private String nomeDocumento;
    private int tamanho;

    private Fila fila = new Fila();

    public Documento() {
    }

    public Documento(String nomeDocumento, int tamanho) {
        this.nomeDocumento = nomeDocumento;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return nomeDocumento;
    }

    public void mostrarFilaDeImpressao() {
        System.out.println();
        System.out.println("Arquivos a serem impressos:");
        fila.mostrar();
        System.out.println();
    }

    public void adicionarNaFilaDeImpressao(Documento documento) {
        // System.out.println(documento + " adicionado na fila.");
        fila.enfileirar(documento);
    }

    public void imprimirProximoDocumento() {
        if (!fila.estaVazia()) {
            fila.desenfileirar();
            System.out.print("Próximo documento: ");
            fila.mostrar();
        } else {
            System.out.println("Nenhum documento na fila para imprimir.");
        }
    }
    
}