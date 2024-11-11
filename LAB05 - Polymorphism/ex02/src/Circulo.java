class Circulo extends FormaBidimensional {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double obterArea() {
        return Math.PI * raio * raio;
    }
}