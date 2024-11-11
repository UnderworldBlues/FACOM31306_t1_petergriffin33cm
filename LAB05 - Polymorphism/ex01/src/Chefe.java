public class Chefe extends Funcionario {

    public Chefe(String nome, String dataNasc, float salario) {
        super(nome, dataNasc, salario);
    }

    public float calcSalario() {
        return this.getSalario();
    }
}
