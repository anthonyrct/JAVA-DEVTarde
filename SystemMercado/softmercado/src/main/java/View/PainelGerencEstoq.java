package View;

import javax.swing.*;
import java.awt.*;

public class PainelGerencEstoq extends JPanel {

    public PainelGerencEstoq() {
        super();
         // Definindo o layout do JPanel como BorderLayout
        setLayout(new BorderLayout());

        // Criando os dados da tabela
        Object[][] dados = {
                {"Lote 1", "Produto A", 10, "01/01/2023", "01/02/2023"},
                {"Lote 2", "Produto B", 20, "02/01/2023", "02/02/2023"},
                // Adicione mais linhas conforme necessário
        };

        // Nomes das colunas
        String[] colunas = {"Lote", "Nome do Produto/Código de Barra", "Quantidade", "Data de Entrega", "Data de Vencimento"};

        // Criando a tabela
        JTable tabela = new JTable(dados, colunas);

        // Adicionando a tabela a um JScrollPane para rolar se houver muitos dados
        JScrollPane scrollPane = new JScrollPane(tabela);

        // Criando JComboBoxes
        JComboBox<String> codProdutoComboBox = new JComboBox<>(new String[]{"Código 1", "Código 2", "Código 3"});
        JComboBox<String> codVencimentoComboBox = new JComboBox<>(new String[]{"Código 1", "Código 2", "Código 3"});
        JComboBox<String> codLoteComboBox = new JComboBox<>(new String[]{"Código 1", "Código 2", "Código 3"});

        // Criando um JPanel para conter as JComboBoxes
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.add(new JLabel("Cod Produto:"));
        comboBoxPanel.add(codProdutoComboBox);
        comboBoxPanel.add(new JLabel("Cod Vencimento:"));
        comboBoxPanel.add(codVencimentoComboBox);
        comboBoxPanel.add(new JLabel("Cod Lote:"));
        comboBoxPanel.add(codLoteComboBox);

        // Criando um JButton "Voltar"
        JButton voltarButton = new JButton("Voltar");

        // Adicionando um ActionListener ao botão (simulando um evento de voltar)
        voltarButton.addActionListener(e -> {
            // Adicione aqui a lógica para lidar com o botão "Voltar"
            // Neste exemplo, simplesmente exibiremos uma mensagem
            JOptionPane.showMessageDialog(this, "Botão Voltar Pressionado!");
        });

        // Adicionando as JComboBoxes, o botão "Voltar" e a tabela ao JPanel
        add(comboBoxPanel, BorderLayout.NORTH);
        add(voltarButton, BorderLayout.WEST); // Adicionado à esquerda
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Criando um JFrame para testar o JPanel
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gerenciamento de Estoque");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Criando o JPanel com a tabela, JComboBoxes e o botão "Voltar"
            PainelGerencEstoq estoquePanel = new PainelGerencEstoq();

            // Adicionando o JPanel ao JFrame
            frame.getContentPane().add(estoquePanel);

            // Configurando o JFrame
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null); // Centraliza a janela na tela
            frame.setVisible(true);
        });
    }
}