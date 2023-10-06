package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio6 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    //Desafio 6 - Verificar se a lista contém algum número maior que 10:

    List<Integer> numerosMaioresQueDez = numeros.stream()
    .filter(n -> n > 10) // Filtra números pares e o zero
    .collect(Collectors.toList());
    System.out.println("Números maior que 10: " + numerosMaioresQueDez);



    }
}
