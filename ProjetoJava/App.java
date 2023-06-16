package ProjetoJava;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;

import ProjetoJava.Contas.ContaPF;
import ProjetoJava.Contas.ContaPJ;

public class App {
    public static void main(String[] args) {
         
    ContaPF contasPf[] = new ContaPF[10];
    ContaPJ contasPj[] = new ContaPJ[10];
    boolean agenciaAberta = true;
    int cont = 0;
    int contaAtual=0;
    while(agenciaAberta){
        int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        +"\n 1 - Criar Conta"
                        +"\n 2 - Acessar Conta"
                        +"\n 3 - Acessar Conta PJ"
                        +"\n 4 - Acessar Conta PF"
                        +"\n 5-Sair"));
        if(acao1==1){
            //criar conta(vou fazer primeiro da PF)
            contasPf[cont] = new ContaPF();//obj criado
            //atribuir infos da conta criada
            contasPf[cont].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
            contasPf[cont].setNumeroConta(1000+cont+1);
            contasPf[cont].setSaldo(0);
            contasPf[cont].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
            cont++;

        } else if (acao1 == 2) {
            //acessar conta - percorrer o vetor criado eprocurar um valor ou nº da conta ou nome
            int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da Conta"));
            for (int i = 0; i < contasPf.length; i++) {
                if (nContaBuscada == contasPf[i].getNumeroConta()) {
                    contaAtual = i;
                    JOptionPane.showMessageDialog(null, "Conta Encontrada");
                }
            }
            boolean acessar = true;
            //
            while(acessar){
                //opções dos métodos da conta PF
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada"));
                if(opcao ==1){
                    contasPf[contaAtual].getSaldo();
                } else if(opcao ==2){
                    contasPf[contaAtual].saque();
                } else if(opcao ==3){
                   contasPf[contaAtual].getEmprestimo(); 
                } else(opcao == 4)

                }

            }

        } else{
            JOptionPane.showMessageDialog(null, "Digite uma ação válida");
        }
    }
    }
}
