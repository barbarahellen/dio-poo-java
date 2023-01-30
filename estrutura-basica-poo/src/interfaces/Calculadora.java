package interfaces;

class Calculadora implements OperacaoMatematica{
    
    @Override
    public void soma(double operando1, double operando2){
        System.out.println("soma: "+ (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("multiplicacao: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("multiplicacao: " + (operando1 / operando2));
    }

    
}
