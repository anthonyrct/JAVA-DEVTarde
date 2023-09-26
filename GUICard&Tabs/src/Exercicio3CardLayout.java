import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class Exercicio3CardLayout extends JFrame {
    public Exercicio3CardLayout() {
        super("Exercicio3 - lista Cards & Tabs");
        // criando o painel Principal
        JPanel mainP = new JPanel();
        // colocando o Layout - CardLayout
        CardLayout cl = new CardLayout();
        mainP.setLayout(cl);
        //Criando Cards para adicionar ao mainP
        JPanel Card1 = new JPanel();
        Card1.add(new JLabel("Pagina inicial"));
        JPanel Card2 = new JPanel();
    }
}
