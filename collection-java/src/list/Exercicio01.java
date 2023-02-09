package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
   Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
   Após isso, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
   e em que mês elas ocorreram (mostrar o mês por extenso: 1 - janeiro, 2 - fevereiro, etc).
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();


        for(int i = 0; i < 6; i++){
            System.out.print("digite a temperatura do mês [" + (i+1) + "]: ");
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
        }

        System.out.println("-------------------------");

        System.out.println("Exibindo todas as temperaturas:");
        temperaturas.forEach(t -> System.out.print(t + " "));
        System.out.println("\n");

        // calculando e exibindo a média:
        double soma = 0;
	        for (double t: temperaturas){
                soma = soma + t;
            }
		        
        double media = soma / temperaturas.size();
        //double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.printf("Média das temperaturas: %.1f\n" , media);


        // exibindo as temperaturas acima da média:
        System.out.printf("\nTemperaturas acima da média: ");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));
        System.out.println("");

        // exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;
        while(iterator.hasNext()){
            Double temp = iterator.next();
            if(temp > media){
                switch(count){
                    case(0):
                        System.out.printf("1 - Janeiro: %.1f\n", temp);
                        break;
                    case(1):
                        System.out.printf("2 - Fevereiro: %.1f\n", temp);
                        break;
                    case(2):
                        System.out.printf("3 - Março: %.1f\n", temp);
                        break;
                    case(3):
                        System.out.printf("4 - Abril: %.1f\n", temp);
                        break;
                    case(4):
                        System.out.printf("5 - Maio: %.1f\n", temp);
                        break;
                    case(5):
                        System.out.printf("6 - Junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.printf("Não houve temperatura acima da média");   
                }
            }
            count++;
        }

    }   
}
