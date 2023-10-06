package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class desafio7 {
public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    
    //Desafio 7 - Encontrar o segundo número maior da lista:

Integer segundoNumero = numeros.stream()
    .distinct()  // Remove elementos repetidos
    .sorted(Comparator.reverseOrder())  // Ordena os números na ordem decrescente
    .skip(1)  // Pula o primeiro número
    .findFirst()  // Encontra o primeiro elemento após o pulo
    .orElseThrow(() -> new NoSuchElementException("Não existe segundo maior número."));
    System.out.println(segundoNumero);
    
}
}
