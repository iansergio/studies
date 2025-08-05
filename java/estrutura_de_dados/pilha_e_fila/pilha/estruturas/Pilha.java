package pilha.estruturas;

public class Pilha {
  private String[] pilha;
  private int posicaoUltimo;

  public String getItemPilha(int i) {
    return this.pilha[i];
  }

  public int getPosicaoUltimo() {
    return this.posicaoUltimo;
  }

  // Construtor da pilha
  public Pilha(int capacidade) {
    this.pilha = new String[capacidade];
    posicaoUltimo = -1;
  }

  // Adicionar ao topo da pilha se ela não estiver cheia
  public void adicionar(String valor) {
    if (posicaoUltimo == this.pilha.length - 1) {
      System.out.println("A pilha está cheia");
      return;
    }
    this.pilha[++posicaoUltimo] = valor;
  }

  // public void adicionar(Pilha pilha) {
  // if (posicaoUltimo == this.pilha.length - 1) {
  // System.out.println("A pilha está cheia");
  // return;
  // }
  // this.pilha[++posicaoUltimo] = pilha.getItemPilha(++posicaoUltimo);
  // }

  // Remover o item do topo da lista, no caso o último adicionado
  public void remover() {
    if (estaVazia()) {
      System.out.println("A pilha está vazia! Não há como remover um valor.");
      return;
    }
    this.pilha[posicaoUltimo] = null;
    posicaoUltimo--;
  }

  // Printar os elementos do último adicionado ao primeiro
  public void mostrar() {
    if (estaVazia()) {
      System.out.println("'não há elementos'");
      return;
    }

    for (int i = posicaoUltimo; i >= 0; i--) {
      System.out.println(this.pilha[i] + " ");
    }
  }

  // Verificar se a pilha esta vazia
  public boolean estaVazia() {
    return posicaoUltimo == -1;
  }

  // Copiar uma pilha para outra
  public Pilha copiar(Pilha pilhaOrigem) {
    Pilha copia = new Pilha(pilhaOrigem.pilha.length);

    for (int i = 0; i <= pilhaOrigem.posicaoUltimo; i++) {
      copia.adicionar(pilhaOrigem.pilha[i]);
    }

    return copia;
  }
}
