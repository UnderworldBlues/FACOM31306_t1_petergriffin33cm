public class App {
    public static void main(String[] args) throws Exception {
        vereador v = new vereador("João", "01/01/2000", "Masculino", 100000, true, 123, "123", "Centro");
        prefeito p = new prefeito("Maria", "01/01/2000", "Feminino", 200000, false, 456, "José", "456");

        System.out.println(v.toString());
        System.out.println(p.toString());
    }
}
