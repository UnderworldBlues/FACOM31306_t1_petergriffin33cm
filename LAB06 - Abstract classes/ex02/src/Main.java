public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaComum(1000.0f, 12345, 1234);

        System.out.println("Saldo da conta comum: " + conta1.getSaldo(1234));
        conta1.creditaValor(200.0f);
        System.out.println("Novo saldo após crédito: " + conta1.getSaldo(1234));

        boolean debito1 = conta1.debitaValor(700.0f);
        System.out.println("Débito de 700.0 na conta comum: " + (debito1 ? "Sucesso" : "Falha"));
        System.out.println("Saldo após débito: " + conta1.getSaldo(1234));

        ContaCorrente conta2 = new ContaEspecial(1500.0f, 54321, 5678, 500.0f);

        System.out.println("Saldo da conta especial: " + conta2.getSaldo(5678));
        conta2.creditaValor(300.0f);
        System.out.println("Novo saldo após crédito: " + conta2.getSaldo(5678));

        boolean debito2 = conta2.debitaValor(2000.0f);
        System.out.println("Débito de 2000.0 na conta especial: " + (debito2 ? "Sucesso" : "Falha"));
        System.out.println("Saldo após débito: " + conta2.getSaldo(5678));
    }
}
