import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class Exercicio3CardLayout extends JFrame {
     //construtor
    public Exercicio3CardLayout() {
        super("Exercicio3 - lista Cards & Tabs");
        // criando o painel Principal
        JPanel mainP = new JPanel();

        // colocando o Layout - CardLayout
        CardLayout cl = new CardLayout();
        mainP.setLayout(cl);

        // Criando Cards para adicionar ao mainP
        JPanel Card1 = new JPanel();
        Card1.add(new JLabel("Pagina inicial"));
        JPanel Card2 = new JPanel();
        Card2.add(new JLabel("Login"));
        JPanel Card3 = new JPanel();
        Card3.add(new JLabel("Cadastro"));
        JPanel Card4 = new JPanel();
        Card4.add(new JLabel("Creditos"));

        // criando os botões
        JButton bNext1 = new JButton("Login");
        JButton bNext2 = new JButton("Cadastro");
        JButton bNext3 = new JButton("Creditos");
        JButton bNext4 = new JButton("pagina inicial");

        // adicionando os botoes aos cards
        Card1.add(bNext1);
        Card2.add(bNext2);
        Card3.add(bNext3);
        Card4.add(bNext4);

        // adicionando os cards ao mainP

        mainP.add(Card1);
        mainP.add(Card2);
        mainP.add(Card3);
        mainP.add(Card4);

        // colocando ações aos botões
        bNext1.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext2.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext3.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext4.addActionListener(e -> {
            cl.next(mainP);
            
        });

        // set do frame
        this.add(mainP);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 220, 220);
        this.setVisible(true);

    }

}
