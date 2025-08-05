package fila;
import fila.app.Documento;

public class FilaApp {
    public static void main(String[] args) {
        
        Documento impressora = new Documento();

        Documento doc1 = new Documento("teste.pdf", 2);
        Documento doc2 = new Documento("outro_documento.pdf", 1);

        impressora.adicionarNaFilaDeImpressao(doc1);
        impressora.adicionarNaFilaDeImpressao(doc2);

        impressora.mostrarFilaDeImpressao();

        impressora.imprimirProximoDocumento();
    }
}