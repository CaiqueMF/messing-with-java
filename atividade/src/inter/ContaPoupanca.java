package inter;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{

    double limite;

    public ContaPoupanca(Scanner entrada, int id) {
        numeroConta = id;
        System.out.println("saldo");
        saldo = entrada.nextDouble();
        System.out.println("limite");
        limite = entrada.nextDouble();
    }

    @Override
    public void sacar(double valor) {
        if(saldo - valor >= -limite){
            saldo = saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void mostrarDados() {
        System.out.println("ContaPoupanca{" +
                "limite=" + limite +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}');
    }

}
