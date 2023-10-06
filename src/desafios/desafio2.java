package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio2 {

    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
     
        //Desafio 2 - Imprima a soma dos números pares da lista:

        System.out.println("Mostre a soma dos números pares da lista: ");
        int somaDosNumerosPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();
        System.out.println("A soma dos numeros pares: " + somaDosNumerosPares);

}
}