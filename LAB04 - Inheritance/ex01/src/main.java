public class main {
    public static void main(String[] args) throws Exception {
        candidatoPrefeito candidatoPrefeito1 = new candidatoPrefeito("João da Silva", "01/01/1990", "Masculino", 1000000.00, true, 10, "Maria da Silva", "Partido A");
        candidatoVereador candidatoVereador1 = new candidatoVereador("Maria da Silva", "01/01/1990", "Feminino", 500000.00, false, 20, "123", "Bairro A");
        candidatoPrefeito candidatoPrefeito2 = new candidatoPrefeito("José da Silva", "01/01/1990", "Masculino", 2000000.00, false, 30, "Maria da Silva", "Partido B");
        candidatoVereador candidatoVereador2 = new candidatoVereador("Fulana da Silva", "01/01/1990", "Feminino", 300000.00, true, 40, "456", "Bairro B");
        System.out.println(candidatoPrefeito1.toString());
        System.out.println(candidatoPrefeito2.toString());
        System.out.println(candidatoVereador1.toString());
        System.out.println(candidatoVereador2.toString());
    }
}
