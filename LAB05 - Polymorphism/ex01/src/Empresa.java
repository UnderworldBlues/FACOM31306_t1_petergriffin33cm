public class Empresa {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("John", "05/02/87", 8000.0f);
        funcionarios[1] = new Vendedor("Paul", "13/04/98", 2500.0f, 5, 50);
        funcionarios[2] = new Operario("George", "12/07/99", 1250.0f, 4.0f);
        funcionarios[3] = new Horista("Richard", "27/11/95", 100.0f, 0.0f);

        FolhaPagamento folha = new FolhaPagamento();

        folha.mostrarFolha(4, funcionarios);


    }
}
