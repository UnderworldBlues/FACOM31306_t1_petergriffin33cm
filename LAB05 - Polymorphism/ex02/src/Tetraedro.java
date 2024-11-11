public class Tetraedro extends FormaTridimensional {
    private double lado;
    private double altura;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    double obterArea() {
        return (lado * lado) * Math.sqrt(3);
    }

    double obterVolume() {
        return (obterArea() * altura) / 3;
    }

}
