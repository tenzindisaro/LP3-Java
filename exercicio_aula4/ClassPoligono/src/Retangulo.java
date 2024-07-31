public class Retangulo extends Poligono{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return base * altura;
    }
}
