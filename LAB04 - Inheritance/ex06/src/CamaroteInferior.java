public class CamaroteInferior extends VIP {
    private String local;

    public CamaroteInferior(String local, Ingresso ingresso, float adicional) {
        super(ingresso, adicional);

        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void mostrar_localizacao() {
        System.out.println("Localizacao: " + this.local);
    }
}
