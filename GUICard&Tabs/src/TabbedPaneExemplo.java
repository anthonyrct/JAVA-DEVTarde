import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPaneExemplo extends JFrame {
    //construtor
    public TabbedPaneExemplo() {
        super("Exemplo JTabbedPane");
        JTabbedPane janelaAbas = new JTabbedPane();
        JPanel aba1 = new JPanel();
        aba1.add(new JButton("Botão 1"));
        aba1.add(new JButton("Botão 2"));
        aba1.add(new JButton("Botão 3"));
        JPanel aba2 = new JPanel();
        aba2.add(new JTextField(("",columns:20))
        //add abas ao JTabbedPane
        janelaAbas.add("Aba JButtons", aba1);
        janelaAbas.add("Aba JTextField", aba2);
        //add JtabbedPane ao Frame
        this.add(janelaAbas);
        //configurar o Frame
        this.setDefaultCloseOperation(2);
        this.setBounds();
    }
}
