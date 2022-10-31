package heranca.dois;

public class Gerente extends Empregado{

    String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente, nome =" + getNome() + "\nidade ="+getIdade()+"\nmatricula ="+getMatricula()+ "\nnome da gerencia ="+getNomeGerencia()+"\nvalor do inss ="+valorInss();
    }
}
