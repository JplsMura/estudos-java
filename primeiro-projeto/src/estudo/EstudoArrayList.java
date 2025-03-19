package estudo;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add("Pão");

        // Add o item entre um item e outro informando o indice do mesmo
        listaDeCompras.add(1, "Batata");

        for (String item : listaDeCompras) {
            System.out.println("Item: " + item);
        }

        // Pega um item informado em tal posição
        String item = listaDeCompras.get(3);

        System.out.println("Na posição 3 eu tenho: " + item);

        // Remover item da lista, passando o nome do item ou o indice ao qual quer remover
        listaDeCompras.remove("Pão");

        for (String item2 : listaDeCompras) {
            System.out.println("Item: " + item2);
        }

        // Verifica se a lista está vázia
        boolean eVazia = listaDeCompras.isEmpty();

        // O tamanho da lista
        int tamanho =  listaDeCompras.size();

        // Verifica se um item existe na lista
        boolean contem = listaDeCompras.contains("Beteraba");

        System.out.println("A lista está vázia? " + eVazia +
                " , qual o tamanho da lista ? " + tamanho +
                ", a lista contem o item Beteraba ?" + contem
        );

        // Limpa a lista
//        listaDeCompras.clear();
//        System.out.println("A lista está vázia ?" + listaDeCompras.isEmpty());

       //Imprime a lista usando o forEach do ArrayList, de forma burra
       listaDeCompras.forEach(produto -> System.out.println("Produto de forma burra: " + produto));

        //Imprime a lista usando o forEach do ArrayList, de forma inteligente usando os metodos do System
        listaDeCompras.forEach(System.out::println);
    }
}
