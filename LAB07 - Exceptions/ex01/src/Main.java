public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("12345678901", "João", 30000);

        try {
            funcionario.aumentarSalario(20); // Aumentar o salário em 20%
            System.out.println("Salário após aumento: R$" + funcionario.getSalario());
        } catch (SalarioInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
