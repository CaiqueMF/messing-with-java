package polimofismo.empresa;

public class Comissoes {
    static int [] comissao = {1500,600,250};

    static int retornarComissao(int numero){
        return comissao[numero-1];
    }
}
