public class Operario extends Funcionario {
    private float producao;

    public Operario(String nome, String dataNasc, float salario, float producao) {
        super(nome, dataNasc, salario);
        this.producao = producao;
    }

    public float calcSalario() {
        return this.getSalario() * producao;
    }

}
