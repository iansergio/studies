import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ARRAY LIST

//        ArrayList<Integer> lista = new ArrayList<>();
//        lista.add(0, 20);
//        lista.add(1, 110);
//        lista.add(2, 21);

//        lista.set(1, 999);
////        int valorRemovido = lista.remove(1);
//
//        System.out.println(lista);
////        System.out.println("Valor removido: " + valorRemovido);
//
//        int pegaValor = lista.get(0);
//        System.out.println(pegaValor);
//
//        int tamanho = lista.size();
//        System.out.println(tamanho);
//
//        boolean vazio = lista.isEmpty();
//        System.out.println(vazio);
//
//        boolean existe = lista.contains(20);
//        System.out.println(existe);

//        for (int i = 0; i < lista.size(); i++) {
//            int elemento = lista.get(i);
//            System.out.print(elemento +",");
//        }

//        for (int elemento : lista ) {
//            System.out.println(elemento);
//        }


        // HASHMAP

//        HashMap <Integer,String> mapa = new HashMap <>();
//        mapa.put(1, "Brasil");
//        mapa.put(0, "Canada");
//
//        String valor = mapa.get(1);
//        System.out.println(valor);
//
//        String valorPadrao = mapa.getOrDefault(99, "?? valor padrao ??");
//        System.out.println(valorPadrao);
//
////        boolean contem = mapa.containsKey(1);
////        System.out.println(contem);
//
////        String valorRemove = mapa.remove(1);
////        System.out.println(valorRemove);
//
//        String valorAntigo = mapa.replace(0,"zzz");
//        System.out.println(mapa);
//        System.out.println(valorAntigo);
//
//        int quantidade = mapa.size();
//        boolean vazio = mapa.isEmpty();
//        mapa.clear();
//
//        System.out.println(quantidade);


        //HASHSET

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);

        conjunto.addAll(Arrays.asList(new Integer[]{1, 2 ,4 ,5}));
//        boolean b = conjunto.contains(3);

        List<Integer> lista = new ArrayList<>();
//        boolean c = conjunto.containsAll(lista);


//        System.out.println(c);

        int arranjo[] = conjunto.toArray();
    }
}