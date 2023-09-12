//imports necessarios para fazer a interface Grafica e os Eventos da calculadora
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//aqui é onde a classe "Calculadora1" está, ela está sendo herdeira de JPanel(basicamente, ela se comporta como uma div se estivessemos em html)
public class Calculadora1 extends JPanel implements ActionListener {
    private JTextField idadeField;
    private JButton calcularButton;
    private JTextField alturaField;
    private JLabel resultadoLabel;

    public Calculadora1() {
        super();
        // definindo o LayOut
        setLayout(new GridLayout(4, 2));

        // Componentes da calculadora
        setSize(300, 150);

        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField();
        
        JLabel alturaLabel = new JLabel("Altura:");
        alturaField = new JTextField();

        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);
        resultadoLabel = new JLabel("");

        add(idadeLabel);
        add(idadeField);
        add(alturaLabel);
        add(alturaField);
        add(new JLabel());
        add(calcularButton);
        add(new JLabel());
        add(resultadoLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            try {
                int idade = Integer.parseInt(idadeField.getText());
                double altura = Double.parseDouble(alturaField.getText());
                double pesoIdeal = calcularPesoIdeal(idade, altura);
                resultadoLabel.setText("Peso ideal para idade" + idade +": " +String.format("%.2f" , pesoIdeal) + " kg");
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite uma Idade e altura Valida.");
            }
        }
    }
    private double calcularPesoIdeal(int idade ,double altura){

        double pesoIdeal =22.0 * (altura * altura);

        return pesoIdeal;
    } 
}
