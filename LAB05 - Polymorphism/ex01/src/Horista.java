public class Horista extends Funcionario {
    private float totalHoras;

    public Horista(String nome, String dataNasc, float salario, float totalHoras) {
        super(nome, dataNasc, salario);
        this.totalHoras = totalHoras;
    }

    public float calcSalario() {
        return this.getSalario() * this.totalHoras;
    }

}
