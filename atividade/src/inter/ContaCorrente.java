package inter;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria implements Imprimivel{

    double taxaOp;

    public ContaCorrente(Scanner entrada, int id) {
        numeroConta = id;
        System.out.println("saldo");
        saldo = entrada.nextDouble();
        System.out.println("taxa");
        taxaOp = entrada.nextDouble();
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor - taxaOp >= 0){
            saldo = saldo - valor - taxaOp;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor - taxaOp;
    }

    @Override
    public void mostrarDados() {
        System.out.println("ContaCorrente{" +
                "taxaOp=" + taxaOp +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}');
    }

}
