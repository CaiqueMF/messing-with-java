package tratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws naoLetraException, letraMinusculaException {
        Scanner leitor = new Scanner(System.in);


        try{
            System.out.println("n1");
            int n1 = leitor.nextInt();
            System.out.println("n2");
            int n2 = leitor.nextInt();
            System.out.println(n1/n2);
        }catch (Exception e){
            e.printStackTrace();
            if(e instanceof InputMismatchException){
                System.out.println("digita direito");
            }else if(e instanceof ArithmeticException){
                System.out.println("para de tentar quebrar");
            }
        }

        try {
            System.out.println("s1");
            String s1 = null;
            System.out.println("s2");
            String s2 = "";
            if(s1.length()>s2.length()){
                System.out.println("s1 maior");
            }else if(s2.length() > s1.length()){
                System.out.println("s2 maior");
            } else if (s1.length()==s2.length()) {
                System.out.println("iguais");
            }
        }catch (Exception e){
            e.printStackTrace();
            if(e instanceof NullPointerException){
                System.out.println("ta vazio");
            }
        }


        String teste = "11abAB";
        for (int i = 0; i < teste.length(); i++) {
            char atual = teste.charAt(i);
            if (Character.isLetter(atual)){
                if (!Character.isUpperCase(atual)){
                    throw new letraMinusculaException("a letra "+(i+1)+" e minuscula");
                }
            } else{
                throw new naoLetraException("o caracter "+(i+1)+" nao e letra");
            }

        }

    }
}
