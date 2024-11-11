public class Funcionario {
    private String CPF;
    private String Nome;
    private double Salario;
    private double tetoSalarial = 40000; // Teto salarial padrão de R$ 40.000

    public Funcionario(String CPF, String Nome, double Salario) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Salario = Salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double percentual) {
        double novoSalario = Salario + Salario * (percentual / 100);

        if (novoSalario < 0) {
            throw new SalarioInvalidoException("Valor inválido de salário");
        } else if (novoSalario > tetoSalarial) {
            throw new SalarioInvalidoException("Valor ultrapassa o teto");
        } else {
            Salario = novoSalario;
        }
    }

    public double getSalario() {
        return Salario;
    }

}