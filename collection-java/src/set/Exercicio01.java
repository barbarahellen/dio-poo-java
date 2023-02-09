package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
 */
public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("crie um conjunto contendo as cores do arco-íris: ");
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("exibindo na ordem aleatória: ");
        System.out.println(cores.toString());
        System.out.println("");  
        
        System.out.println("exibindo uma abaixo da outra: ");
        for(String cor: cores){
            System.out.println(cor);
        }
        System.out.println("");

        System.out.println("quantidade de cores: " + cores.size());
        System.out.println("");
    
        System.out.println("cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<String>(cores);
        System.out.println(cores2);
        System.out.println("");

        System.out.println("cores na ordem que foram informadas: ");
        Set<String> cores3 = new LinkedHashSet<>();
        cores3.add("vermelho");
        cores3.add("laranja");
        cores3.add("amarelo");
        cores3.add("verde");
        cores3.add("azul");
        cores3.add("azul-marinho");
        cores3.add("violeta");
        System.out.println(cores3);
        System.out.println("");

        List<String> coresList = new ArrayList<>(cores3);
        System.out.println("exibindo as cores na ordem inversa: ");
        Collections.reverse(coresList);
        System.out.println(coresList);
        System.out.println("");

        System.out.println("exibindo cores que começam com 'V':");
        for (String cor : cores) {
            if(cor.startsWith("v", 0)){
                System.out.println(cor);
            }
        }

        System.out.println("");
        cores.clear();
        System.out.println("conjunto está vazio? " + cores.isEmpty());
        


    }
}
