public class App {
    public static void main(String[] args) throws Exception {
        candidato v = new candidato("João", "01/01/2000", "Masculino", 100000, true, 123);
        candidato p = new candidato("Maria", "01/01/2000", "Feminino", 200000, false, 456);

        vereador v1 = new vereador(v, "123", "Centro");
        vereador p1 = new vereador(p, "456", "Norte");

        System.out.println(v1.toString());
        System.out.println(p1.toString());
    }
}
