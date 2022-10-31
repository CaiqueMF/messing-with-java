package slides.quatro;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resposta = "oi";
        ListaContaBancaria lista = new ListaContaBancaria();
        ContaBancaria conta;
        while (!resposta.equals("e")){
            System.out.println("a - incluir, b - alterar, c - excluir, d - consultar dados, e - sair");
            resposta = leitor.next();
            switch (resposta){
                case "a":
                    System.out.println("nome");
                    String leitorConta = leitor.next();
                    System.out.println("limite de credito");
                    conta = new ContaBancaria(leitorConta, leitor.nextDouble());
                    try{
                       lista.incluir(conta);
                    } catch (OverflowException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "b":
                    System.out.println("numero da conta");
                    try{
                        conta = lista.obterconta(leitor.nextInt());
                        System.out.println("alterar o q?\n1- nome, 2 - limite");
                        resposta = leitor.next();
                        switch (resposta){
                            case "1":
                                conta.nomeProprietario = leitor.next();
                                break;
                            case "2":
                                conta.limiteCred = leitor.nextDouble();
                                break;
                        }
                    } catch (NotFoundException e) {
                        throw new RuntimeException(e);
                    }
                case "c":
                    System.out.println("que conta?");
                    try{
                        conta = lista.obterconta(leitor.nextInt());
                        try {
                            lista.excluir(conta);
                        } catch (UnderflowException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (NotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "e":
                    System.out.println("que conta?");
                    try {
                        conta = lista.obterconta(leitor.nextInt());

                        while (!resposta.equals("4")){
                            System.out.println("1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair");
                            resposta = leitor.next();
                            switch (resposta) {
                                case "1":
                                    try {
                                        conta.depositar(leitor.nextDouble());
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("valor errado");
                                    }
                                    break;
                                case "2":
                                    try {
                                        conta.sacar(leitor.nextDouble());
                                    } catch (EstouroDeLimiteException e) {
                                        System.out.println("sem credito");
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("valor errado");
                                    }
                                    break;
                                case "3":
                                    conta.informarSaldo();
                                    break;
                            }
                        }

                    } catch (NotFoundException e) {
                        throw new RuntimeException(e);
                    }


            }
        }

    }
}
