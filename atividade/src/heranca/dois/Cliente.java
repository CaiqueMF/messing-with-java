package heranca.dois;

public class Cliente extends Pessoa{
    private double valorDividar;
    private int anoNascimento;

    public double getValorDividar() {
        return valorDividar;
    }

    public void setValorDividar(double valorDividar) {
        this.valorDividar = valorDividar;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente, nome ="+getNome()+ "\nidade ="+getIdade()+"\nsexo"+getSexo()+"\nvalor da divida ="+getValorDividar()+"\nano nacimento"+getAnoNascimento();
    }
}
