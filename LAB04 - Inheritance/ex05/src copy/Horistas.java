public class Horistas extends Funcionario {
    private double valorHora;
    private int totalHoras;

    public Horistas(String nome, String dataNascimento, float valorHora, int totalHoras) {
        super(nome, dataNascimento, 0);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double calc_Salario() {
        return valorHora * totalHoras;
    }
}
