package ProvaJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {
     private List<ContaPF> contasPF;
    private List<ContaPJ> contasPJ;

    public Banco() {
        contasPF = new ArrayList<>();
        contasPJ = new ArrayList<>();
    }
    public void criarContaPF(String nomeCliente) {
    ContaPF contaPF = new ContaPF(nomeCliente);
    contasPF.add(contaPF);
    JOptionPane.showMessageDialog(null, "Conta de Pessoa Física criada com sucesso.");
}

public void criarContaPJ(String nomeEmpresa) {
    ContaPJ contaPJ = new ContaPJ(nomeEmpresa);
    contasPJ.add(contaPJ);
    JOptionPane.showMessageDialog(null, "Conta de Pessoa Jurídica criada com sucesso.");
}
public static void main(String[] args) {
    Banco banco = new Banco();

    while (true) {
        String menu = "Selecione a opção:\n" +
                      "1. Criar conta\n" +
                      "2. Verificar saldo\n" +
                      "3. Realizar saque\n" +
                      "4. Realizar depósito\n" +
                      "5. Realizar empréstimo\n" +
                      "6. Sair do banco";

        String opcaoStr = JOptionPane.showInputDialog(menu);
        int opcao = Integer.parseInt(opcaoStr);

        switch (opcao) {
            case 1:
                String tipoContaStr = JOptionPane.showInputDialog("Escolha o tipo de conta:\n" +
                                                                    "1. Pessoa Física\n" +
                                                                    "2. Pessoa Jurídica");
                int tipoConta = Integer.parseInt(tipoContaStr);

                if (tipoConta == 1) {
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    banco.criarContaPF(nomeCliente);
                } else if (tipoConta == 2) {
                    String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa:");
                    banco.criarContaPJ(nomeEmpresa);
                }
                break;
            
            case 2:
                // Lógica para verificar saldo
                break;

            case 3:
                // Lógica para realizar saque
                break;

            case 4:
                // Lógica para realizar depósito
                break;

            case 5:
                // Lógica para realizar empréstimo
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso banco. Até mais!");
                System.exit(0);

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
        }
    }
}

}
