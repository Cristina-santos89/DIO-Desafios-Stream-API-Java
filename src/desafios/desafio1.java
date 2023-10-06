package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class desafio1 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Desafio 1 - Mostre a lista na ordem numérica:

    System.out.println("Mostre a lista na ordem númerica: ");
    List<Integer> listaOrdemNumerica = numeros.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
    System.out.println(listaOrdemNumerica);

}
}


