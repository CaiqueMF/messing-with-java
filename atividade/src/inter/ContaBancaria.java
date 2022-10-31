package inter;

public abstract class ContaBancaria implements Imprimivel{
    int numeroConta;
    double saldo;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public void transferir(double valor, ContaBancaria alvo){
        sacar(valor);
        alvo.depositar(valor);
    }
}
