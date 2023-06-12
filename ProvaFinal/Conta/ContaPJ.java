package ProvaFinal.Conta;

public class ContaPJ extends Conta{
    //atributos
    String nCnpj;
    //metodos
    //construtores

    public ContaPJ(String nome, double saldo, int numeroConta, String nCnpj) {
        super(nome, saldo, numeroConta);
        this.nCnpj = nCnpj;
    }

    public ContaPJ(String nCnpj) {
        this.nCnpj = nCnpj;
    }
    //get and set

    public String getnCnpj() {
        return nCnpj;
    }

    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }
    
}
