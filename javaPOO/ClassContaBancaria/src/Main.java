public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1087, 2000);

        conta.depositar(500);
        conta.sacar(100);
        conta.verSaldo();
    }
}