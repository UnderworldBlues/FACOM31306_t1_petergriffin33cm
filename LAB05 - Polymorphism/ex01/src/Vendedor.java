public class Vendedor extends Funcionario {
    private int totalVendas;
    private int comissao;

    public Vendedor(String nome, String dataNasc, float salario, int totalVendas, int comissao) {
        super(nome, dataNasc, salario);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public float calcSalario() {
        return this.getSalario() + comissao * totalVendas;
    }
}
