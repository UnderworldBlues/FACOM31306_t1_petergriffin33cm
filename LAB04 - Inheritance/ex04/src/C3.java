public class C3 extends C2{
    public int publico3;
    protected int protegido3;
    private int privado3;

    public C3() {
        this.publico3 = 0;
        this.protegido3 = 0;
        this.privado3 = 0;

        System.out.println("Classe C3: chamada do construtor padrao, sem parametros!");
    }

    public C3(int publico3, int protegido3, int privado3) {
        super(publico3, protegido3, privado3);

        this.publico3 = publico3;
        this.protegido3 = protegido3;
        this.privado3 = privado3;

        System.out.println("Classe C3: chamada do construtor padrao, com parametros!");
    }

    public void mostrar_atributos() {
        mostrar_atributosC2();
        System.out.println("<< CLASSE 03 >>");
        System.out.println("Publico => " + this.publico3);
        System.out.println("Privado => " + this.privado3);
        System.out.println("Protegido => " + this.protegido3);
    }

    public void mostar_atributos_super() {
        super.mostrar_atributosC2();
        System.out.println("<< CLASSE 03 >>");
        System.out.println("Publico => " + this.publico3);
        System.out.println("Privado => " + this.privado3);
        System.out.println("Protegido => " + this.protegido3);
    }
}
