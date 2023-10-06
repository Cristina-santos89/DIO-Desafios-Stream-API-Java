package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class desafio5 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Desafio 5 - Calcule a média dos números maiores que 5:

    double mediaNumerosMaiorQueCinco = numeros.stream()
    .filter(n -> n > 5)
    .mapToDouble(Integer::doubleValue)
    .average()
    .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a média."));
    System.out.println("A média dos números maiores que 5: " + mediaNumerosMaiorQueCinco);




}
}