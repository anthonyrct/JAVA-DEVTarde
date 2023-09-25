import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel1 extends JPanel  {
    public Painel1() {
        super();
        JTextField mensagemField;
        JButton nextButton;

        // vamos colocar o CardLayout
        setLayout(new CardLayout());

        // vamos definir o tamanho da janela
        setSize(200, 120);

        JLabel mensagemJLabel = new JLabel("Coloque sua mensagem aqui");
        mensagemField = new JTextField();

        nextButton = new JButton("Proximo");
        nextButton.addActionListener(e->{
            if(e.getSource() == nextButton){
                
            }
        });
         

    }
}
