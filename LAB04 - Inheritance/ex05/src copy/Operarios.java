public class Operarios extends Funcionario {
    private double valorProducao;
    private int quantidadeProduzida;

    public Operarios(String nome, String dataNascimento, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, 0);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double calc_Salario() {
        return valorProducao * quantidadeProduzida;
    }
}
