package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendasPainel extends JPanel {
    private JButton registrarVendaButton;
    private JTextField clienteField;
    private JTextField carroField;
    private JTextField dataField;

    // adicionar outros campos se necessario
    public VendasPainel() {
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2));
        formPanel.add(new JLabel("Cliente:"));
        clienteField = new JTextField();
        formPanel.add(clienteField);
        formPanel.add(new JLabel("Carro:"));
        carroField = new JTextField();
        formPanel.add(carroField);
        formPanel.add(new JLabel("Data:"));
        dataField = new JTextField();
        formPanel.add(dataField);

        // Adicione outros campos conforme necessário...

        add(formPanel, BorderLayout.CENTER);

        registrarVendaButton = new JButton("Registrar Venda");
        add(registrarVendaButton, BorderLayout.SOUTH);

        // Adicione um ActionListener ao botão para lidar com o evento de registrar
        // venda
        registrarVendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar a venda (pode envolver interação com o controller)
                // Exemplo: System.out.println("Venda registrada!");
            }
        });
    }

    // Métodos para obter valores dos campos, se necessário
    public String getCliente() {
        return clienteField.getText();
    }

    public String getCarro() {
        return carroField.getText();
    }

    public String getData() {
        return dataField.getText();
    }

    // Adicione métodos para outros campos conforme necessário...
}
