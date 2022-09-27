package JavaPOO.aula2;

public class RodarAplicacao {
    public static void main(String[] args){
        Funcionarios funcionarios = new Funcionarios();

        Funcionarios gerente = new Gerente();
        Funcionarios faxineiro = new Faxineiro();
        Funcionarios vendedor = new Vendedor();

        //Gerente gerente = new Funcionarios();
        Vendedor vendedor = (Vendedor) new Funcionarios();
    }
}
