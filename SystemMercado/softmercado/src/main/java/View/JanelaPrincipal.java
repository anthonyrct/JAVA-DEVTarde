package View;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class JanelaPrincipal {

    public JanelaPrincipal() {
        // Criando a janela principal
        JFrame frame = new JFrame("Escolha seu Cargo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Ajuste o tamanho conforme necessário

        // Definindo a janela para tela cheia
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true); // Remove as bordas da janela quando em tela cheia

        // Criando o painel principal com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Adicionando a JLabel no topo e centralizada
        JLabel label = new JLabel("Seja Bem-Vindo(a)\nQual o seu cargo?");
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Ajuste a fonte e o tamanho conforme necessário
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 40, 0); // Aumentando a distância vertical para 40 pixels
        gbc.anchor = GridBagConstraints.PAGE_START;
        panel.add(label, gbc);

        // Criando os botões no centro com um layout de Flow
        JPanel buttonPanel = new JPanel();

        JButton caixaButton = new JButton("Caixa");
        JButton gerenteButton = new JButton("Gerente");

        // Aumentando a fonte dos botões
        Font buttonFont = new Font("Arial", Font.PLAIN, 18); // Ajuste a fonte e o tamanho conforme necessário
        caixaButton.setFont(buttonFont);
        gerenteButton.setFont(buttonFont);

        buttonPanel.add(caixaButton);
        buttonPanel.add(Box.createHorizontalStrut(20)); // Adicionando um espaçamento horizontal de 20 pixels
        buttonPanel.add(gerenteButton);

        // Adicionando os botões ao centro
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(40, 0, 0, 0); // Aumentando a distância vertical para 40 pixels
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);

        // Adicionando o painel à janela
        frame.getContentPane().add(panel);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}