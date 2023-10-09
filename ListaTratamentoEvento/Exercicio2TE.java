package ListaTratamentoEvento;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class Exercicio2TE extends JFrame {
    // atributos
    private JTextField teclaField;
    private JTextField textoField;
    private JTextArea replicaArea;
    private JLabel teclaLabel;
    private JLabel textolLabel;
    private JLabel replicaLabel;
    JPanel mainP;

    public Exercicio2TE() {

        super("exercicio 2-TE");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 200, 200);
        // definindo o Layout
        setLayout(new GridLayout(4, 1));

        // componentes
        teclaLabel = new JLabel("Tecla digitada: ");
        teclaField = new JTextField();

        textolLabel = new JLabel("Digite seu Texto: ");
        textoField = new JTextField();

        replicaLabel = new JLabel("");
        replicaArea = new JTextArea(3, 25);
        mainP.add(replicaArea);

        
        }
        public void run(){
            this.setVisible(true);

    }
}
