public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("<< Exercicio 2 >>");

        candidatos c1 = new candidatos();
        candidatos c2 = new candidatos();
        candidatos c3 = new candidatos();

        c1.setNome("Mario");
        c1.setData("01/01/1990");
        c1.setGenero("Masculino");
        c1.setBensTotais(1000.0f);
        c1.setReeleicao(false);
        c1.setNoPartido(1);
        c1.setCargoPretendido("Presidente");

        c2.setNome("Vitor");
        c2.setData("02/02/1991");
        c2.setGenero("Masculino");
        c2.setBensTotais(2000.0f);
        c2.setReeleicao(true);
        c2.setNoPartido(2);
        c2.setCargoPretendido("Governador");

        c3.setNome("Ana");
        c3.setData("03/03/1992");
        c3.setGenero("Feminino");
        c3.setBensTotais(3000.0f);
        c3.setReeleicao(false);
        c3.setNoPartido(3);
        c3.setCargoPretendido("Prefeito");

        c1.mostrar();
    }
}
