public class Amigos extends Contato {
    private int grau;

    public Amigos(String a, String n, String e, String av, int g) {
        super(a, n, e, av);
        this.grau = g;
    }

    public void imprimirContato() {
        imprimirBasico();
        if (grau == 1) {
            System.out.println("Melhor amigo");
        } else if(grau == 2) {
            System.out.println("Amigo");
        } else {
            System.out.println("Conhecido");
        }
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}
