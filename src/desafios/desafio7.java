package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio7 {
public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



    
    //Desafio 7 - Encontrar o segundo número maior da lista:

     numeros.stream()
    .limit(2)
    .collect(Collectors.toSet());



    
}
}
