public class Main {
    public static void main(String[] args) {
        ContaCorrente conta2 = new ContaEspecial(1500.0f, 54321, 5678, 500.0f);

        System.out.println("Saldo da conta especial: " + conta2.getSaldo(5678));
        conta2.creditaValor(300.0f);
        System.out.println("Novo saldo após crédito: " + conta2.getSaldo(5678));

        boolean debito2 = conta2.debitaValor(2000.0f);
        System.out.println("Débito de 2000.0 na conta especial: " + (debito2 ? "Sucesso" : "Falha"));
        System.out.println("Saldo após débito: " + conta2.getSaldo(5678));
    }
}
