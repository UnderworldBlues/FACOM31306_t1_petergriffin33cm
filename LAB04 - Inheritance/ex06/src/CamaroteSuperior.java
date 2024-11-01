public class CamaroteSuperior extends VIP {
    private String local;

    public CamaroteSuperior(String local, Ingresso ingresso, float adicional) {
        super(ingresso, adicional);

        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public float valor_ingresso() {
        return super.calc_valor(super.getAdicional());
    }
}
