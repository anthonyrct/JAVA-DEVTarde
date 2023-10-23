package GUISerializacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JPanel {
    private JTextField inputNome;
    private JTextField inputIdade;

    public Cadastro() {
        super();
        // metodos
        setSize(250, 220);

        JPanel painel2 = new JPanel(); 

        inputIdade = new JTextField(20);
        inputNome = new JTextField(5);
        JButton confimarButton = new JButton("Confirmar");
        JButton adicionarButton = new JButton("Adicionar");
        JButton removerButton = new JButton("Remover");
        JButton removerTodosButton = new JButton("Remover");
        JButton salvarButton = new JButton("Salvar");
        JButton atualizarButton = new JButton("Atulizar");

        painel2.add(new JLabel("Nome"));
        painel2.add(inputNome);
        painel2.add(new JLabel("Idade:"));
        painel2.add(inputIdade);
        painel2.add(cadastrarButton);
        painel2.add(atualizarButton);
        painel2.add(apagarButton);
        painel2.add(apagarTodosButton);
        painel2.add(salvarButton);

    }
}
