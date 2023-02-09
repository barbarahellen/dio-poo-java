package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*  Dadas as seguintes informações sobre minhas séries favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episódio);
    Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 30
    Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
    Série 3 = nome: b99, genero: comédia, tempoEpisodio: 30
*/

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("-- ordem aleatoria --");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("b99", "comedia", 30));
        }};
        
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("");
        System.out.println("-- ordem de inserção --");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("");
        System.out.println("ordem natural -  tempo do episódio");
        Set<Serie> minhaSeries2 = new TreeSet<>();
        System.out.println(minhaSeries2);
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("");
        System.out.println("-- ordem nome/gênero/tempoEpisodio --");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

        minhasSeries3.addAll(minhasSeries);
        
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
            
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome = " + nome + ", genero = " + genero + ", tempoEpisodio = " + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
   
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
       int nome = s1.getNome().compareTo(s2.getNome());
       if(nome != 0){
        return nome;
       }

       int genero = s1.getGenero().compareTo(s2.getGenero());
       if(genero !=0){
        return genero;
       }

       return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}