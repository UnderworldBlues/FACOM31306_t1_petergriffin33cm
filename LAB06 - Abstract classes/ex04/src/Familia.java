public class Familia extends Contato {
    private String parentesco;

    public Familia(String a, String n, String e, String av, String p) {
        super(a, n, e, av);
        this.parentesco = p;
    }

    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Parentesco: " + parentesco);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
