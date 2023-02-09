package set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    a) Ordem de inserção;
    b) Ordem natural(nome);
    c) IDE;
    d) Ano de criação e nome;
    e) Nome, ano de criação e IDE;
    Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Exercicio02 {
    public static void main(String[] args) {

        //System.out.println("---- Ordem Aleatória ----");
        Set<LinguagemFavorita> linguagens = new HashSet<>();
            linguagens.add(new LinguagemFavorita("C", 1969, "code"));
            linguagens.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            linguagens.add(new LinguagemFavorita("Python", 1992, "PyCharm"));
        

        /*
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        */


        System.out.println("--- Ordem de inserção ---");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(
                Arrays.asList(
            new LinguagemFavorita("C", 1969, "VScode"),
            new LinguagemFavorita("Java", 1991, "IntelliJ"),
            new LinguagemFavorita("Python", 1991, "PyCharm")));

       
        for (LinguagemFavorita linguagem : linguagens1) {
            System.out.println(linguagem);
        }

        System.out.println("---- Ordem Natural (nome) ----");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        //System.out.println(linguagens2);
        for (LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem);
        }
        
        System.out.println("---- Ordem IDE ----");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIDE());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens3) {
            System.out.println(linguagem);
        }

        System.out.println("---- Ordem Ano de criação e Nome ----");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) {
            System.out.println(linguagem);
        }

        System.out.println("---- Ordem Nome, Ano de criação e IDE ----");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIDE());
        linguagens5.addAll(linguagens3);
        for (LinguagemFavorita linguagem : linguagens5) {
            System.out.println(linguagem);
        }


    }
}

class LinguagemFavorita{
    
    public String nome;
    public int anoDeCriacao;
    public String IDE;

    public LinguagemFavorita(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }


    public String getNome() {
        return nome;
    }
    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita [nome = " + nome + ", anoDeCriacao = " + anoDeCriacao + ", IDE = " + IDE + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeCriacao;
        result = prime * result + ((IDE == null) ? 0 : IDE.hashCode());
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
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao != other.anoDeCriacao)
            return false;
        if (IDE == null) {
            if (other.IDE != null)
                return false;
        } else if (!IDE.equals(other.IDE))
            return false;
        return true;
    }
   
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        return lf1.IDE.compareToIgnoreCase(lf2.IDE);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
       int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
       if(anoDeCriacao != 0){
        return anoDeCriacao;
       }
       return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
       int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
       int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);

       if(anoDeCriacao != 0){
        return nome;
       }

       if(anoDeCriacao != 0){
        return anoDeCriacao;
       }

       return lf1.IDE.compareToIgnoreCase(lf2.IDE);
    }
}


