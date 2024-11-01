public class Ingresso {
    private float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public void escreveValor() {
        System.out.println(">> Valor do ingresso: R$" + this.valor);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
