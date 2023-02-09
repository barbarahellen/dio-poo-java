package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) throws Exception {

        //Formas de criar uma lista

//      List notas = new ArrayList();  // antes do java 5

//      List<Double> notas = new ArrayList<Double>();   // generics (jdk 5) - Diamond operator <> (jdk 6)

//      ArrayList<Double> notas = new ArrayList<>();    // não é recomendável 

//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));     

//      List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);   // forma válida, porém limitada pois não se pode mais adicionar ou retirar elementos.
/*      notas.add(10d);
        System.out.println(notas);    */   
          
//      List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);        // a lista também fica imutável
/*      notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/


        // melhor forma de fazer:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());    // método toString serve para retornar uma representação string de um objeto
        System.out.println("");

        System.out.println("exiba a posição da nota 5.0: " + notas.indexOf(5.0));    // método indexOf serve para mostrar a posição 
        System.out.println("");
        
        System.out.println("adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);   // posição, elemento
        System.out.println(notas);
        System.out.println("");

        System.out.println("substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);     //método set altera o elemento em determinada posição
        System.out.println(notas);
        System.out.println("");

        System.out.println("confira se a nota 5.0 está na lista: " + notas.contains(5.0));  // verifica se determinado elemento está na lista
        System.out.println("");

        System.out.println("exiba todas as notas na ordem que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("");

        System.out.println("exiba a terceira nota adicionada: ");
        notas.get(2);
        System.out.println(notas.toString());
        System.out.println("");

        System.out.println("exiba a menor nota: "+ Collections.min(notas));  // como lista é do tipo collection, então pode ser utilizado
       
        System.out.println("exiba a maior nota: "+ Collections.max(notas));

        // soma dos valores 
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: " + soma);
        System.out.println("");

        System.out.println("exiba a médias das notas: " + soma/notas.size());   // size: quantidade de elementos
        System.out.println("");

        System.out.println("remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println("");

        System.out.println("remova a nota da posição 0: ");  // a nota 7 será removida
        notas.remove(0);
        System.out.println(notas);
        System.out.println("");

        System.out.println("remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        Double menorQueSete = 0.0;
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7.0){
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("");

        System.out.println("apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println("");
        
        System.out.println("confira se a lista está vazia: ");
        System.out.println(notas.isEmpty()); 
        
    }
}
