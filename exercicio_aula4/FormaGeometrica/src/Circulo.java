public class Circulo implements FormaGeometrica {
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
    @Override
    public double calcularPerimetro() {
        double circunferencia = 2 * Math.PI * raio;
        return circunferencia;
    }
}
