package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio01 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0", "4","2", "3", "9", "6", "5");

        System.out.println("imprima todos os elementos dessa lista de Strings: ");

        /* 
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
        */

        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //numerosAleatorios.forEach(s -> System.out.println(s));
        
        numerosAleatorios.forEach(System.out :: println);

        System.out.println("pegue os 5 primeiros numeros e coloque dentro de um set: ");
        numerosAleatorios.stream()
        .limit(5)                  // limit(quantidade de elementos que quer pegar)
        .collect(Collectors.toSet())       // collect (coleta e armazena no set)
        .forEach(System.out::println);  

        System.out.println(numerosAleatorios);

        System.out.println("transforme essa lista de strings em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()           //Stream<Integer>
                                        .map(Integer :: parseInt) 
                                        .collect(Collectors.toList());      //List<Integer>
            System.out.println(collectList);

        System.out.println("pegue os numeros pares e maiores que 2 e coloque numa lista: ");
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> (i % 2 == 0 && i > 2)) // filtra e pega os números que você quer
            .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);

        System.out.println("mostre a média dos números:");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()   // média
            .ifPresent(System.out::println);

        System.out.println("remova os valores ímpares: ");
        collectList.removeIf(i -> (i % 2 != 0));
        System.out.println(collectList);


        
    }
}
