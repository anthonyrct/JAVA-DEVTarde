
//os imports que são chamados de acordo com o código
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//a criação do frame
public class CalculadoraBorderLayout extends JFrame {
    private JTextField display;

    // variaveis
    private String currentInput = "";
    private double currentValue = 0.0;
    private String currentOperator = "";

    // titulo da janela principal
    public CalculadoraBorderLayout() {
        setTitle("Calculadora Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //criação dos paineis
        JPanel mainPanel = new JPanel(new BorderLayout());
        display = new JTextField();
        display.setEditable(false);
        mainPanel.add(display, BorderLayout.NORTH);
        JPanel buttonPanel = createButtonPanel();
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);

    }

    // criação dos botões
    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        return buttonPanel;
    }

    // o funcionamento de click dos botões
    class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            String buttonText = clickedButton.getText();

            // a regra de digitar os botões de 0-9 para gerar os resultados
            if (buttonText.matches("[0-9]")) {
                currentInput += buttonText;
                display.setText(currentInput);
            } else if (buttonText.matches("[+\\-*/]")) {
                if (!currentInput.isEmpty()) {
                    currentValue = Double.parseDouble(currentInput);
                    currentOperator = buttonText;
                    currentInput = "";
                }
            } else if (buttonText.equals("=")) {
                if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
                    double valor2 = Double.parseDouble(currentInput);
                    double result = performOperation(currentValue, valor2, currentOperator);
                    display.setText(Double.toString(result));
                    currentInput = "";
                    currentOperator = "";
                    currentValue = result;
                }
            }
        }
    }

    // a ação dos botões de calcular os valores digitados
    private double performOperation(double valor1, double valor2, String resultado) {
        switch (resultado) {
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                if (valor2 != 0) {
                    return valor1 / valor2;
                } else {
                    JOptionPane.showMessageDialog(this, "Não se divide por 0");
                }
        }
        // o retorno do resultado pode ser em decimal
        return 0.0;
    }
}