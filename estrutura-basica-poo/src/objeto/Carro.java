package objeto;
/*
    Evolua o conceito do exercício 3 criando objetos da classe "Carro". 
    Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". 
    Passe também uma mensagem para o cálculo do total para encher o tanque.
 */

public class Carro{
    String cor;  
    String modelo;
    int capacidadeTanque;
 
    /*
        Construtores:
        duas formas de criar
    */   
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    // Getters e Setters:
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}