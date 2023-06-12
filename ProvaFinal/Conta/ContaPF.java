package ProvaFinal.Conta;

public class ContaPF extends Conta {
    //atributos
    String nCpf;
    //metodos
    //construtor

    public ContaPF(String nome, double saldo, int numeroConta, String nCpf) {
        super(nome, saldo, numeroConta);
        this.nCpf = nCpf;
    }

    public ContaPF(String nCpf) {
        this.nCpf = nCpf;
    }
    public ContaPF() {
    }
    //get and set

    public String getnCpf() {
        return nCpf;
    }

    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }
    

    
}
