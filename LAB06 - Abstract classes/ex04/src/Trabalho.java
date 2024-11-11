public class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String a, String n, String e, String av, String t) {
        super(a, n, e, av);
        this.tipo = t;
    }

    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Tipo de trabalho: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
