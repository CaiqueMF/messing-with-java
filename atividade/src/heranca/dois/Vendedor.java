package heranca.dois;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Vendedor, nome"+getNome()+"\nsalario ="+getSalario()+"\nvalor das vendas"+ valorVendas + "\nquandidade de vendas"+qntVendas;
    }
}
