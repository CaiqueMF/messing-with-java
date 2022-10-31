package inter;

import java.util.Scanner;

public class Menu {
    int id = 0;
    Banco banco;
    public Menu(Scanner leitor) {
        banco = new Banco();
        String resposta = "0";
        while (!resposta.equals("5")){
            System.out.println("1 - criar conta, 2 - selecionar conta, 3 - remover conta, 4 - gerar relatorio, 5 - finalizar");
            resposta = leitor.next();
            if(resposta.equals("1")){
                criarConta(leitor);
            } else if (resposta.equals("2")) {
                System.out.println("conta alvo");
                int contaAlvo = leitor.nextInt();
                ContaBancaria atual = banco.procurarConta(contaAlvo);
                if (atual!=null)menu2(leitor, atual);
                else System.out.println("conta nao encontrada");
            } else if (resposta.equals("3")) {
                System.out.println("numero da conta");
                int alvo = leitor.nextInt();
                ContaBancaria achei = banco.procurarConta(alvo);
                if(achei!=null)banco.remover(banco.procurarConta(alvo));
                else System.out.println("conta nao encontrada");
            } else if (resposta.equals("4")) {
                banco.mostrarDados();
            }
        }
    }


    public void menu2(Scanner leitor, ContaBancaria atual){
        System.out.println("a - depositar, b - sacar, c - transferir, d - gerar relatorio, e - retornar ao menu anterior");
        String resposta = "a";
        while (!resposta.equals("e")){
            resposta = leitor.next();
            if(resposta.equals("a")){
                System.out.println("valor");
                atual.depositar(leitor.nextDouble());
            } else if (resposta.equals("b")) {
                System.out.println("valor");
                atual.sacar(leitor.nextDouble());
            } else if (resposta.equals("c")) {
                System.out.println("valor");
                double valor = leitor.nextDouble();
                System.out.println("conta alvo");
                ContaBancaria alvo = banco.procurarConta(leitor.nextInt());
                atual.transferir(valor, alvo);
            } else if (resposta.equals("d")) {
                atual.mostrarDados();
            }
        }

    }

    public void criarConta(Scanner leitor){
        System.out.println("poupanca (1) ou corrente (2)");
        String resposta = leitor.next();
        if(resposta.equals("1")){
            ContaPoupanca nova = new ContaPoupanca(leitor, id);
            id++;
            banco.inserir(nova);
        } else if (resposta.equals("2")) {
            ContaCorrente nova = new ContaCorrente(leitor, id);
            id++;
            banco.inserir(nova);
        }
    }
}
