public class Main {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(5f);

        CamaroteInferior c1 = new CamaroteInferior("Brasil", ingresso, 2f);

        c1.mostrar_localizacao();
    }
}
