package slides.quatro;

public class ListaContaBancaria {
    ContaBancaria [] contas = new ContaBancaria[10];
    int contador = 0;

    public void incluir(ContaBancaria conta) throws OverflowException {
        if (contador>9)throw new OverflowException("passou do limite");
        else {
            contas[contador]=conta;
            contador++;
        }
    }

    public void excluir(ContaBancaria conta) throws UnderflowException {
        if (contador==0)throw new UnderflowException("lista vazia");
        else {
            for (int i = 0; i < contas.length; i++) {
                if (contas[i].equals(conta)){
                    contas[i]=null;
                }
            }
            boolean achou = false;
            for (int i = 0; i < contas.length; i++) {
                if (contas[i]==null)achou = true;
                if (achou){
                    contas[i-1]=contas[i];
                    contas[i]=null;
                }
            }
            contador--;
        }

    }

    public ContaBancaria obterconta(int i) throws NotFoundException{
        if (contas[i]==null)throw new NotFoundException("essa conta nao existe");
        return contas[i];
    }
}
