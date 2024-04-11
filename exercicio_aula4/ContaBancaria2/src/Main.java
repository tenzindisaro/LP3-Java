public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1087, 2000);

        conta.depositar(500);
        try {
            conta.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
        conta.verSaldo();
    }
}