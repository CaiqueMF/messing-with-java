package polimofismo.empresa;

public class FuncionarioGraduacao extends FuncionarioMedio{
    String faculdade;

    public FuncionarioGraduacao(int cod) {
        super(cod);
        renda = renda *2;
        codFuncional = cod;
        comissao = Comissoes.retornarComissao(codFuncional);
        rendaTotal = renda + comissao;
    }
}
