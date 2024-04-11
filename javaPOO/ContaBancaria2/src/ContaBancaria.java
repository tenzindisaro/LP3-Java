public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){

        saldo += deposito;
    }

    public void sacar(double saque) throws SaldoInsuficienteException {
        if(saque > saldo){
            throw new SaldoInsuficienteException();
        }
        saldo -= saque;
    }

    public void verSaldo(){
        System.out.println("Saldo = " + saldo);
    }

}
