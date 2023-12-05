package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


public class PainelCadGeral extends JPanel {

   public PainelCadGeral() {
    super();
    // Criando o painel principal com GridBagLayout
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    // Adicionando o título
    JLabel titleLabel = new JLabel("Página de Cadastro");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.insets = new Insets(0, 0, 20, 0);
    gbc.anchor = GridBagConstraints.PAGE_START;
    panel.add(titleLabel, gbc);

    // Adicionando o JLabel para "Digite o seu nome"
    JLabel nameLabel = new JLabel("Digite o seu nome:");
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.insets = new Insets(0, 0, 5, 0);
    gbc.anchor = GridBagConstraints.LINE_START;
    panel.add(nameLabel, gbc);

    // Adicionando o JTextField para o nome
    JTextField nameField = new JTextField(20);
    gbc.gridy = 2;
    gbc.insets = new Insets(0, 0, 20, 0);
    panel.add(nameField, gbc);

    // Adicionando o JLabel para "Digite a sua senha aqui"
    JLabel passwordLabel = new JLabel("Digite a sua senha:");
    gbc.gridy = 3;
    gbc.insets = new Insets(0, 0, 5, 0);
    panel.add(passwordLabel, gbc);

    // Adicionando o JPasswordField para a senha
    JPasswordField passwordField = new JPasswordField(20);
    gbc.gridy = 4;
    gbc.insets = new Insets(0, 0, 20, 0);
    panel.add(passwordField, gbc);

    // Adicionando o botão de cadastro
    JButton cadastrarButton = new JButton("Cadastrar");
    gbc.gridy = 5;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(cadastrarButton, gbc);

    // Criando o frame e adicionando o painel
    JFrame frame = new JFrame("Página de Cadastro");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel);
    frame.setSize(400, 300); // Ajuste o tamanho conforme necessário
    frame.setVisible(true);
}
}
   

