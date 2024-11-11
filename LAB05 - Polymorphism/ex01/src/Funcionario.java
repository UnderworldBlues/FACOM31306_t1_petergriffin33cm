public class Funcionario {
    private String nome;
    private String dataNasc;
    private float salario;

    public Funcionario(String nome, String dataNasc, float salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcSalario() {
        return getSalario();
    }
}
