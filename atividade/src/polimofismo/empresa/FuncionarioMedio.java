package polimofismo.empresa;

public class FuncionarioMedio extends FuncionarioBasico{
    String escolaMedio;

    public FuncionarioMedio(int cod) {
        super(cod);
        renda = (int) (renda * 1.5);
        codFuncional = cod;
        comissao = Comissoes.retornarComissao(codFuncional);
        rendaTotal = renda + comissao;
    }
}
