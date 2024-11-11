class Esfera extends FormaTridimensional {
    double raio;

    Esfera(double raio) {
        this.raio = raio;
    }

    double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    double obterVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }
}