public class Main {
    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica circulo = new Circulo(3);
        FormaGeometrica retangulo = new Retangulo(4, 6);

        // Testando os métodos calcularArea() e calcularPerimetro() para cada forma
        System.out.println("Quadrado:");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRetângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}