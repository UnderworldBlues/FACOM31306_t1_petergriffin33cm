class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    double obterArea() {
        return lado * lado;
    }
}