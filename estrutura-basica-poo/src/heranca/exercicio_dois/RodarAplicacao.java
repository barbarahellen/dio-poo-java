package heranca.exercicio_dois;

public class RodarAplicacao {
    public static void main(String[] args) {
        // upcast
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // downcast - deve ser evitado
        Vendedor vendedor_ = (Vendedor) new Funcionario(); 
    }
}
