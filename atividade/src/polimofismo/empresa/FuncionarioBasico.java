package polimofismo.empresa;

public class FuncionarioBasico extends Funcionario{
    String escola;

    public FuncionarioBasico(int cod) {
        super(cod);
        renda = (int) (renda * 1.1);
        codFuncional = cod;
        comissao = Comissoes.retornarComissao(codFuncional);
        rendaTotal = renda + comissao;
    }


}
