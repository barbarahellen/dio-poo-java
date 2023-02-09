package list;
import java.util.LinkedList;

/*
 * Resolva os exercícios utilizando os métodos da implementação LinkedList
 */
public class ExemploLinkedList {
    public static void main(String[] args) {
        System.out.println("crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista");

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("");

        System.out.println("mostre a primeira nota da nova lista sem removê-la");
        System.out.println(notas2.get(0));
        System.out.println("");

        notas2.remove(0);
        System.out.println("mostre a primeira nota da lista removendo-a");
        System.out.println(notas2.get(0));
        System.out.println("");
    }
}
