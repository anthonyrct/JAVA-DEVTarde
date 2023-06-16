package ProjetoJava.Contas;

public  abstract class Conta {
     //atributos
    String nome;
    double saldo;
    int numeroConta;
    //métodos
    //construtor default
    //get and set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
