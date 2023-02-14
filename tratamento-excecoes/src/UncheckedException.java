import javax.swing.*;

// Fazer a divisão de dois inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continuelooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            // código que pode dar exception
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("resultado: " + resultado);
                JOptionPane.showMessageDialog(null, "resultado: " + resultado);
                continuelooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "entrada inválida! informe um número inteiro");
                // e.printStackTrace();

            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "impossível dividir número por 0");

            } finally{
                System.out.println("chegou no finally");
            }
            
        } while (continuelooping);

        System.out.println("o código continua");
    }
    
    public static int dividir(int a, int b){
        return a / b;
    }
}
