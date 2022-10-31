package slides.um;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean [] verificador = {true, true};
        int []n = new int[2];
        while (verificador[0]){
            System.out.println("entre numero 1");
            try{
                n[0] = obterIntValido(leitor.nextInt());
                verificador[0]=false;
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("entre um numero valido");
                leitor.next();
            }
        }
        while (verificador[1]){
            System.out.println("entre numero 1");
            try{
                n[1] = obterIntValido(leitor.nextInt());
                verificador[1]=false;
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("entre um numero valido");
                leitor.next();
            }
        }

    }
    public static int obterIntValido(int n){
    return n;
    };
}
