package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class desafio4 {

    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


// Desafio 4 - Remova todos os valores ímpares:

    //System.out.println("Removendo os números ímpares da lista: ");
    //numeros1.removeIf(i -> i % 2 != 0);
    //System.out.println(numeros1);


    System.out.println("Remova os valores ímpares: ");
    numeros1 = numeros.removeIf(integer -> integer % 2 != 0);
    System.out.println(numeros);
    //numeros1.removeIf(i -> (i % 2 != 0));
   // System.out.println(numeros1);

    
}
}