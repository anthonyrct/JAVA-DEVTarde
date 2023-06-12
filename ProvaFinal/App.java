package ProvaFinal;

import javax.swing.JOptionPane;

import ProvaFinal.Conta.ContaPF;
import ProvaFinal.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {

        ContaPF contasPF[] = new ContaPF[10];
        ContaPJ contasPJ[] = new ContaPJ[10];
        int cont = 0;
        int contaAtual = 0;
        boolean agenciaAberta = true;
        while (agenciaAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Criar Conta;"
                    + "\n 2 - Acessar Conta;"));
            if (acao1 == 1) {
                // criar conta(vou fazer primeiro da PF)
                contasPF[cont] = new ContaPF(); // obj criado
                // atribuir infos
                contasPF[cont].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPF[cont].setNumeroConta(1000 + cont + 1);
                contasPF[cont].setSaldo(0);
                contasPF[cont].setnCpf(JOptionPane.showInputDialog("Informe o CPF"));
                cont++;

            } else if (acao1 == 2) {
                // acessar conta - percorrer o vetor criado eprocurar um valor ou nº da conta ou
                // nome
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Conta"));
                for (int i = 0; i < contasPF.length; i++) {
                    if (nContaBuscada == contasPF[i].getNumeroConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                    }
                }
                boolean acessar = true;
                //
                while (acessar) {
                    // opções dos métodos da conta PF
                    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada"));
                    if (opcao == 1) {
                        contasPF[contaAtual].getSaldo();
                    }
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Digite uma ação válida");
            }
            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a proxima ação desejada:"
                    +"\n1 - Verificar Saldo;"
                    +"\n2 - Saque;"
                    +"\n3 - Deposito;"
                    +"\n4 - Emprestimo;"
                    +"\n5 - Sair da Conta"));
        }
    }
}
