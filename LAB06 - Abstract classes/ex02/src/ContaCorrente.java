public abstract class ContaCorrente {
    protected float saldo;
    private int estado;
    private int numConta;
    private int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; // conta ativa
    }

    public abstract boolean debitaValor(float val);

    public abstract void creditaValor(float val);

    public float getSaldo(int pwd) {
        if (senha == pwd)
            return saldo;
        else
            return -1;
    }

    protected int getSenha() {
        return senha;
    }

    protected int getEstado(int pwd) {
        if (senha == pwd)
            return estado;
        else
            return -1;
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd)
            estado = e;
    }

    protected boolean isSenha(int pwd) {
        if (senha == pwd)
            return true;
        else
            return false;
    }
}
