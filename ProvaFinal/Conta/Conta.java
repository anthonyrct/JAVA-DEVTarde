package ProvaFinal.Conta;

public abstract class Conta {
    //atributos
    String nome;
    double saldo;
    int numeroConta;
    double saldoAtual;
    double saldoMaximo;
    double saque;
    
    //metodos
    //construtores
    public Conta(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
    
   public Conta(double saldoAtual, double saldoMaximo) {
        this.saldoAtual = saldoAtual;
        this.saldoMaximo = saldoMaximo;
    }

public Conta(){
   }
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

public double getSaldoAtual() {
    return saldoAtual;
}

public void setSaldoAtual(double saldoAtual) {
    this.saldoAtual = saldoAtual;
}

public double getSaldoMaximo() {
    return saldoMaximo;
}

public void setSaldoMaximo(double saldoMaximo) {
    this.saldoMaximo = saldoMaximo;
}
   
}
