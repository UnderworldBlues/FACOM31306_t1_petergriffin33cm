public class C2 extends C1 {
    public int publico2;
    protected int protegido2;
    private int privado2;

    public C2() {
        this.publico2 = 0;
        this.protegido2 = 0;
        this.privado2 = 0;

        System.out.println("Classe C2: chamada do construtor padrao, sem parametros!");
    }

    public C2(int publico2, int protegido2, int privado2) {
        this.publico2 = publico2;
        this.protegido2 = protegido2;
        this.privado2 = privado2;

        System.out.println("Classe C2: chamada do construtor padrao, com parametros!");
    }

    public void mostrar_atributosC2() {
        mostrar_atributos();
        System.out.println("<< CLASSE 02 >>");
        System.out.println("Publico => " + this.publico2);
        System.out.println("Privado => " + this.privado2);
        System.out.println("Protegido => " + this.protegido2);
    }

    public void mostar_atributos_super() {
        super.mostrar_atributos();
        System.out.println("<< CLASSE 02 >>");
        System.out.println("Publico => " + this.publico2);
        System.out.println("Privado => " + this.privado2);
        System.out.println("Protegido => " + this.protegido2);
    }
}
