public class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    public boolean debitaValor(float val) {
        if (getEstado(getSenha()) != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > getSaldo(getSenha()))
            return false;

        saldo -= val;
        if (saldo == 0)
            setEstado(getSenha(), 2); // torna conta inativa
        return true;
    }

    public void creditaValor(float val) {
        saldo += val;
    }

    public void setSaldo(float v) {
        this.saldo = v;
    }
}