package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class desafio4 {

    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


// Desafio 4 - Remova todos os valores ímpares:

    System.out.println("Removendo os números ímpares da lista: ");
        List<Integer> numerosParesComZero = numeros.stream()
        .filter(n -> n % 2 == 0 || n == 0) // Filtra números pares e o zero
        .collect(Collectors.toList());

        System.out.println("Números pares e neutro na lista: " + numerosParesComZero);

    
}
}