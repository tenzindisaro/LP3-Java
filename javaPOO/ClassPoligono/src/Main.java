public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Área do Retangulo: " + retangulo.area());
        System.out.println("Área do Circulo: " + circulo.area());
        System.out.println("Área do Triangulo: " + triangulo.area());
    }
}