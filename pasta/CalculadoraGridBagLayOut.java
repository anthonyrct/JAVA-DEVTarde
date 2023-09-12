import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();
        this.add(new JLabel("Calculadora 2"));
           private JFrame frame;
    private JPanel panel;
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    // bollean pra janela ser vísivel pelo usuário
    public void setVisible(boolean b) {
    }

    // criação do painel e do frame
    public CalculadoraGridBagLayout() {
        frame = new JFrame("Calculadora de Velocidade");
        panel = new JPanel(new GridBagLayout());

        // criação das posições dos botões com o GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        inputField = new JTextField(10);
        calculateButton = new JButton("Calcular");
        resultLabel = new JLabel("");

        // distinguindo oas cores dos background e das fontes
        calculateButton.setBackground(Color.gray);
        panel.setBackground(Color.black);
        inputField.setBackground(Color.lightGray);
        resultLabel.setForeground(Color.lightGray);

        // posicionando o botão de acordo com a coordenada do grid
        gbc.ipady = 40;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(inputField, gbc);
        gbc.gridy = 1;
        panel.add(calculateButton, gbc);
        gbc.gridy = 2;
        panel.add(resultLabel, gbc);

        // chamando o ouvindo das innformações
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularVelocidade();
            }
        });

        // ajustando o tamanho do frame(página principal)
        frame.add(panel);
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // comando para acontecer o calculo e transformá-lo em km/h
    private void calcularVelocidade() {
        try {

            int valorDigitado = Integer.parseInt(inputField.getText());
            int velocidadeCalculada = valorDigitado * 1000;

            // como ele vai aparecer pro usuário como resultado
            resultLabel.setText("Resultado: " + velocidadeCalculada + " km/h");
        } catch (NumberFormatException ex) {
            resultLabel.setText("Digite um valor válido");
        }
    }
}
}
