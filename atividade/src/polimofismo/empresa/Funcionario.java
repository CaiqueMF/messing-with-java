package polimofismo.empresa;

public class Funcionario {
    String nome;
    int codFuncional;
    int comissao;

    int renda = 1000;

    int rendaTotal;
    public Funcionario(int cod) {
        codFuncional = cod;
        comissao = Comissoes.retornarComissao(codFuncional);
        rendaTotal = renda + comissao;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", comissao=" + comissao +
                ", rendaTotal=" + rendaTotal +
                '}';
    }
}
