package polimofismo.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario [] teste = new Funcionario[10];
        int [] custo = {0,0,0,0,0};

        for (int i = 0; i < teste.length; i++) {
            int n;
            if (i<=0){
                n = 1;
            }else if(i<=3){
                n = 2;
            }else {
                n = 3;
            }
            if (i<=3){
                teste[i] = new FuncionarioBasico(n);
                custo[1]+= teste[i].rendaTotal;
            } else if (i<=7) {
                teste[i] = new FuncionarioMedio(n);
                custo[2]+= teste[i].rendaTotal;
            }else {
                teste[i] = new FuncionarioGraduacao(n);
                custo[3]+=teste[i].rendaTotal;
            }


            custo[4]+=teste[i].rendaTotal;
            System.out.println(teste[i]);
        }
        System.out.println("custo funcionario: "+custo[0]+"\ncusto funcionario basico: "+custo[1]+"\ncusto funcionario medio: "+custo[2]+"\ncusto funcionario graduacao :"+custo[3]+ "\ncusto total :"+custo[4]);

    }
}
