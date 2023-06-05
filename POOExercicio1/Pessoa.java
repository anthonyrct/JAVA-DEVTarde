package POOExercicio1;

import javax.swing.JOptionPane;

public class Pessoa {
    // declarar os atributos
    private String Nome;
    private double altura;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    // metódos
    // construtor - mesmo nome da classe();
    public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
        Nome = nome;
        this.altura = altura;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // construtor vazio
    public Pessoa() {
    }

    // getters and setters
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // metodo de imprimmir
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + Nome);
        JOptionPane.showMessageDialog(null, "altura: " + altura);
        JOptionPane.showMessageDialog(null,
                "nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);

    }

    // metodo para calcular a idade
    public int idade() {
        int calculo;
        if (diaNascimento <= 5 && mesNascimento <= 6) {
            calculo = 2023 - anoNascimento;
        } else {
            calculo = 2023 - anoNascimento - 1;
        }
        return calculo;
    }
}
