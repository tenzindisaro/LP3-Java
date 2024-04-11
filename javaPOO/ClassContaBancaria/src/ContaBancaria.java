public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void sacar(double saque){
        if(saldo >= saque){
            saldo = saldo - saque;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verSaldo(){
        System.out.println("Saldo = " + saldo);
    }

}
