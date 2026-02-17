public class ContaBancaria {
private int  númerodaconta;
private double saldo;
private String Nomedotitular;

    public String getNomedotitular() {
        return Nomedotitular;
    }

    public void setNomedotitular(String nomedotitular) {
        Nomedotitular = nomedotitular;
    }

    public int getNúmerodaconta() {
        return númerodaconta;
    }

    public void setNúmerodaconta(int númerodaconta) {
        this.númerodaconta = númerodaconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String Nomedotitular,int númerodaconta,double saldo){
        this.númerodaconta = númerodaconta;
        this.saldo = saldo;
        this.Nomedotitular= Nomedotitular;
    }
}
