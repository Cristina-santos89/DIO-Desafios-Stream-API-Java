package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio3 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 3 - Verifique se todos os números da lista são positivos:

    //numeros.stream()
    //.allMatch(n -> n > 0)
    //.forEach(System.out::println);

    boolean todosPositivos = todosPositivos(numeros);
    System.out.println("Todos os números são positivos " + todosPositivos);
    System.out.println(numeros);
    }
    public static boolean todosPositivos(List<Integer>List){
        return List.stream().allMatch(i -> i > 0);
    }
}


