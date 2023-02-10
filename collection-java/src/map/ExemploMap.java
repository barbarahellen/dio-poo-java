package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
    modelo = gol - consumo = 14,4km/l
    modelo = uno - consumo = 15,6 km/l
    modelo = mobi - consumo = 16,1 km/l
    modelo = hb20 - consumo = 14,5 km/l
    modelo = kwid - consumo = 15,6 km/l
 */
public class ExemploMap {
    public static void main(String[] args) {

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares =  new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("substitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("cofira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("exiba o terceiro modelo adicionado: ");

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //retorna um set

        System.out.println("exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // retorna o set e os elemento dentro set são do tipo entry
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

            }
        }

        System.out.println("exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosficiente);
            }
        }

        System.out.println("exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("exiba  soma dos consumos: " + soma);

        System.out.println("exiba a m´pedia dos consumos deste dicionário de carros: "+ (soma/carrosPopulares.size()));
        System.out.println(carrosPopulares);


        System.out.println("remova os modelos com o consumo igual a 15.6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 =  new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("exiba o dicionario ordenado pelo modelo: "); //modele é a chave, ordenado pelo treemap
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
