public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Quadrado(5);
        formas[1] = new Circulo(3);
        formas[2] = new Esfera(4);
        formas[3] = new Cubo(3);
        formas[4] = new Tetraedro(4, 3);

        for (Forma forma : formas) {
            if (forma instanceof FormaBidimensional) {
                System.out.println("Descrição: Forma bidimensional");
                System.out.println("Área: " + forma.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Descrição: Forma tridimensional");
                System.out.println("Área: " + forma.obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println();
        }
    }
}
