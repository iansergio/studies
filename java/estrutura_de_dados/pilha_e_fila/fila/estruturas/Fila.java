package fila.estruturas;

import fila.app.Documento;

public class Fila {

  private No inicio;
  private No fim;
  private int tamanho;

  public Fila() {
    this.inicio = null;
    this.fim = null;
    this.tamanho = 0;
  }

  public boolean estaVazia() {
    return this.tamanho == 0;
  }

  public void mostrar() {
    if (estaVazia()) {
      System.out.println("A fila está vazia");
      return;
    }

    No atual = inicio;
    while (atual != null) {
      System.out.print(atual.dado);
      if (atual.proximo != null) {
        System.out.print(" -> ");
      }
      atual = atual.proximo;
    }
    System.out.println();
  }

  public void enfileirar(Documento documento) {
    No novoNo = new No(documento);
    if (estaVazia()) {
      inicio = novoNo;
      fim = novoNo;
    } else {
      fim.proximo = novoNo;
      novoNo.anterior = fim;
      fim = novoNo;
    }
    tamanho++;
  }

  public void desenfileirar() {
    if (estaVazia()) {
      System.out.println("A fila está vazia");
      return;
    }
    inicio = inicio.proximo;
    tamanho--;
  }
}