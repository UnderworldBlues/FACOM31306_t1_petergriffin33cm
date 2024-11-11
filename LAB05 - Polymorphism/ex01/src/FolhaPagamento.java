public class FolhaPagamento {

    public void mostrarFolha(int numFuncionarios, Funcionario[] f) {
        System.out.println("<< FOLHA DE PAGAMENTO >>");
        for(Funcionario i: f) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Salário: " + i.calcSalario());
        }
    }

}
