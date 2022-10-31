package slides.quatro;

public class ContaBancaria {

    double saldo;
    String nomeProprietario;
    double limiteCred;

    public ContaBancaria(String nomeProprietario, double limiteCred) {
        this.nomeProprietario = nomeProprietario;
        this.limiteCred = limiteCred;
    }

    public void depositar(double valor){
        if (valor<0)throw new IllegalArgumentException("valor negativo");
        else saldo+=valor;
    }

    public void sacar(double valor) throws EstouroDeLimiteException {
        if (valor<0)throw new IllegalArgumentException("valor negativo");
        else if (saldo-valor<-limiteCred)throw new EstouroDeLimiteException("passou do limite");
        else saldo-=valor;
    }

    public void informarSaldo(){
        System.out.println(saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", limiteCred=" + limiteCred +
                '}';
    }
}
