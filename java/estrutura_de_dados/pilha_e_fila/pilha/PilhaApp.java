package pilha;
import pilha.app.Editor;
import pilha.estruturas.Pilha;

public class PilhaApp {
  public static void main(String[] args) {
    Editor editor = new Editor();

    System.out.println("Ação 1");
    editor.inserirTexto("Texto inicial");
    editor.exibirTexto();

    System.out.println("Ação 2");
    editor.inserirTexto("Mais texto adicionado");
    editor.exibirTexto();

    System.out.println("Ação 3");
    editor.desfazer();
    editor.exibirTexto();

    System.out.println("Ação 4");
    editor.refazer();
    editor.exibirTexto();

    System.out.println("Ação 5");
    editor.inserirTexto("Novo texto");
    editor.exibirTexto();

    System.out.println("Ação 6");
    editor.desfazer();
    editor.exibirTexto();

    System.out.println("Ação 7");
    editor.desfazer();
    editor.exibirTexto();

    System.out.println("Ação 8");
    editor.desfazer();
    editor.exibirTexto();

    System.out.println("Ação 9");
    editor.refazer();
    editor.exibirTexto();
  }
}