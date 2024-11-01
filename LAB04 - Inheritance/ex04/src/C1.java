public class C1{
    public int publico1;
    protected int protegido1;
    private int privado1;

    public C1() {
        this.publico1 = 0;
        this.protegido1 = 0;
        this.privado1 = 0;

        System.out.println("Classe C1: chamada do construtor padrao, sem parametros!");
    }

    public C1(int publico1, int protegido1, int privado1) {
        this.publico1 = publico1;
        this.protegido1 = protegido1;
        this.privado1 = privado1;

        System.out.println("Classe C1: chamada do construtor padrao, com parametros!");
    }

    public void mostrar_atributos() {
        System.out.println("<< CLASSE 01 >>");
        System.out.println("Publico => " + this.publico1);
        System.out.println("Privado => " + this.privado1);
        System.out.println("Protegido => " + this.protegido1);
    }
}
