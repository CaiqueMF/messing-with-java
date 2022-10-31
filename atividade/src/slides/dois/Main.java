package slides.dois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.println("qual mes? (numero)");
        Scanner leitor = new Scanner(System.in);
        int entrada=0;
        while (entrada != 99){
            try {
                entrada = leitor.nextInt();
                try{
                    System.out.println(meses[entrada-1]);
                }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                }
            }catch (InputMismatchException e){
                e.printStackTrace();
                leitor.next();
            }
        }

    }
}
