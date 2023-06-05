package POOExercicio3;

import javax.swing.JOptionPane;

public class Elevador {
    // construir o elevador
    // atributos do elevador
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int capacidadeAtual;

    // construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }

    // construir os métodos
    // setters e getters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    // métodos adicionais
    // iniciar
    public void iniciar() {
        capacidadeAtual = 0;
        andarAtual = 0;
    }

    public void entrar(int pessoas) {
        if ((capacidadeAtual + pessoas) >= nMaxPessoas) {
            JOptionPane.showInputDialog(null, "Capacidade Máxima Atingida");
            JOptionPane.showInputDialog(null, "Pessoas para fora"
                    + (capacidadeAtual + pessoas - nMaxPessoas));
        } else {
            capacidadeAtual += pessoas;
        }

    }

    // sair
    public void sair(int pessoas) {
        if (pessoas < capacidadeAtual) {
         capacidadeAtual -=pessoas; 
        }else{
            JOptionPane.showMessageDialog(null,"Informe um numero válido, Quantidade atual: "+capacidadeAtual);
        }
    }

    // subir
    public void subir(int nAndares) {
        if (nAndares + andarAtual > nMaxAndares) {
            JOptionPane.showMessageDialog(null, "Não Pode subir");
            JOptionPane.showMessageDialog(null, "Andar Atual " + andarAtual);
        } else {
            andarAtual += nAndares;
        }
    }
    //descer
    public void descer(int nAndares) {
        if (nAndares< andarAtual) {
            andarAtual -= nAndares;
        } else{
            JOptionPane.showMessageDialog(null, "Informe um numero válido, Andar atual: "
            +andarAtual);
        }
    }
}
