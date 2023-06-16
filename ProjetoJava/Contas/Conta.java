
package ProjetoJava.Contas;

import javax.swing.JOptionPane;

public abstract class Conta {
    // atributos
    String nome;
    double saldo;
    int numeroConta;
    double Emprestimo;

    // métodos
    // construtor default
    // get and set
    
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

    // métodos opcionais
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        saldo -= saque;
    }

    public void deposito() {
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Deposito"));
        saldo += deposito;
    }

    public double getEmprestimo() {
        return Emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        Emprestimo = emprestimo;
    }
}
