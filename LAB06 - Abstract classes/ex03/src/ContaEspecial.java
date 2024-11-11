public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;

        if (this.limite == 0) {
            ContaComum contaComum = new ContaComum(val, num, pwd);
            contaComum.setSaldo(val);
            contaComum.setEstado(pwd, getEstado(pwd));
        }
    }

    public boolean debitaValor(float val) {
        if (getEstado(getSenha()) != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > (getSaldo(getSenha()) + limite))
            return false;

        saldo -= val;
        if (saldo == 0)
            setEstado(getSenha(), 2); // torna conta inativa
        return true;
    }

    public void creditaValor(float val) {
        saldo += val;
    }

    public float getLimite() {
        return limite;
    }
}