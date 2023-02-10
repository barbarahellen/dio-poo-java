package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
    Dadas as seguintes informações sobre meus livros favoritos e seus autores,
    crie um dicionário e ordene este dicionário:
    exibindo (Nome Autor - Nome Livro);
    Autor = Hawking, Stephen -  Livro = nome: Uma Breve História do Tempo. páginas: 256
    Autor = Chbosky, Stephen -  Livro = nome: As vantagens de ser invisível. paginas: 286
    Autor = Lewis, C.S.      -  Livro = nome: As Crônicas de Nárnia. páginas: 752
*/
public class OrdenacaoMap {
    public static void main(String[] args) {
        
        System.out.println("ordem aleatória");

        Map<String, Livro> livros = new HashMap<>(){{
           
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Chbosky, Stephen", new Livro("As vantagens de ser invisível", 286));
            put("Lewis, C.S.", new Livro("As Crônicas de Nárnia", 752));
           

        }}; 

        for(Map.Entry<String, Livro> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("ordem de inserção");

        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Chbosky, Stephen", new Livro("As vantagens de ser invisível", 286));
            put("Lewis, C.S.", new Livro("As Crônicas de Nárnia", 752));

        }}; 

        for(Map.Entry<String, Livro> livro : livros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--- ordem alfabética autores ---");

        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for(Map.Entry<String, Livro> livro : livros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- ordem alfabética dos nomes dos livros ---");

        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> livro : livros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        //System.out.println(livros3);

        System.out.println("--- ordem número de página ---");
        
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPagina());
        livros4.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> livro : livros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
        }

    }
}



class Livro{
 
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }    
    
    @Override
    public String toString() {
        return "Livro [nome = " + nome + ", paginas = " + paginas + "]";
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}