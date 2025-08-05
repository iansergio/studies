import estruturas.Iterador;
import estruturas.Lista;

public class IteradorApp {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.adicionarAoInicio(54); 
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(2);

        Iterador iterador = new Iterador(lista, lista.inicio);
        
        // Inserir após o atual
        iterador.inserirAposAtual(999);
        iterador.display();

        // Inserir após o atual
        iterador.inserirAposAtual(2222);
        iterador.display();

        // Remover após o atual
        iterador.removerAposAtual();
        iterador.display();

        // Inserir antes do atual
        iterador. inserirAntesAtual(1000);
        iterador.display();

        // Remover antes do atual
        iterador.removerAntesAtual();
        iterador.display();
    }
}
