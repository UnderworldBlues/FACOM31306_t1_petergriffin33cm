class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    double obterArea() {
        return 6 * lado * lado;
    }

    double obterVolume() {
        return lado * lado * lado;
    }
}