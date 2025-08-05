import estruturas.Lista;

public class ListaApp {
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

        // Inserir no final da lista
        lista.mostrarNos();        
        System.out.println();
        lista.inserirNoFinal(999);
        lista.mostrarNos();
        
        // Método que retorna o número de nós da lista
        System.out.println();
        lista.numeroDeNos();
        lista.mostrarNos();

        // Inserir após valor informado
        System.out.println();
        lista.inserirAposValorInformado(54, 111);
        lista.mostrarNos();
    }
}
