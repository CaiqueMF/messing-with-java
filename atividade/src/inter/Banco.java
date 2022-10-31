package inter;

import java.util.ArrayList;

public class Banco implements Imprimivel{
    ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    public void inserir(ContaBancaria conta){
        contas.add(conta);
    }

    public void remover(ContaBancaria conta){

        for (ContaBancaria atual : contas){
            if(atual.numeroConta == conta.numeroConta){
                contas.remove(atual);
            }
        }
    }

    public ContaBancaria procurarConta(int alvo){
        for (ContaBancaria atual : contas){
            if(atual.numeroConta == alvo){
                return atual;
            }
        }
        return null;
    }

    @Override
    public void mostrarDados() {
        for (ContaBancaria atual : contas){
            atual.mostrarDados();
        }
    }
}
