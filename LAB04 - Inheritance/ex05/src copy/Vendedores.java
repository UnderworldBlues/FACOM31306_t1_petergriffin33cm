public class Vendedores extends Funcionario {
    private double comissao;
    private double vendas;

    public Vendedores(String nome, String dataNascimento, float salarioFixo, float comissao, float vendas) {
        super(nome, dataNascimento, salarioFixo);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double calc_salario() {
        return super.calc_Salario() + comissao * vendas;
    }
}

