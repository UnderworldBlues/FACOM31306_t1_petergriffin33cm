public class VIP extends Ingresso {
    private float adicional;

    public VIP(Ingresso ingresso, float adicional) {
        super(ingresso.getValor());
        this.adicional = adicional;
    }

    public float calc_valor(float adicional) {
        return adicional + super.getValor();
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
}
