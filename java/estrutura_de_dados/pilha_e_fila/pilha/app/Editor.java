package pilha.app;

import pilha.estruturas.Pilha;

public class Editor {

  int tamanho = 10;
  Pilha pilha = new Pilha(tamanho);
  Pilha pilhaDesfazer = new Pilha(tamanho);
  Pilha pilhaRefazer = new Pilha(tamanho);

  public Editor() {
  }

  public void exibirTexto() {
    pilha.mostrar();
    System.out.println("-------------");
    System.out.println();

    // System.out.println("Pilha auxiliar (pilhaDesfazer)");
    // pilhaDesfazer.mostrar();
    // System.out.println();
    // System.out.println("Pilha auxiliar (pilhaRefazer)");
    // pilhaRefazer.mostrar();
  }

  public void inserirTexto(String valor) {
    pilhaDesfazer = pilha.copiar(pilha);
    pilhaRefazer = new Pilha(tamanho);
    pilha.adicionar(valor);
  }

  public void desfazer() {
    if (!pilhaDesfazer.estaVazia()) {
      pilhaRefazer = pilha.copiar(pilha);
      pilha = pilhaDesfazer.copiar(pilhaDesfazer);
      pilhaDesfazer.remover();
    } else {
      System.out.println("Não há nada para desfazer.");
    }
  }

  public void refazer() {
    if (!pilhaRefazer.estaVazia()) {
      pilhaDesfazer = pilha.copiar(pilha);
      pilha = pilhaRefazer.copiar(pilhaRefazer);
      pilhaRefazer.remover();

    } else {
      System.out.println("Não há nada para refazer");
    }
  }
}