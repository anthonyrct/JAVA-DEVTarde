import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.CardLayout;

public class Exercicio5CardLayout extends JFrame {
    //atributo
    int pontuacao = 0;
    // construtor
    public Exercicio5CardLayout() {
        super("Exercicio5 - lista de Cards & Tabs");
        // painel Principal
        JPanel mainP = new JPanel();

        // definindo o Layout do Painel(CardLayout)
        CardLayout cl = new CardLayout();
        mainP.setLayout(cl);

        // Criando os Cards do jogo

        // primeiro Card
        JPanel Card1 = new JPanel();
        Card1.add(new JLabel("Inicio"));

        // segundo Card
        JPanel Card2 = new JPanel();
        Card2.add(new JLabel("Primeira-Pergunta:"));
        Card2.add(new JLabel("Qual a fruta mais azeda do mundo?"));
        Card2.add(new JTextField(25));

        // terceiro Card
        JPanel Card3 = new JPanel();
        Card3.add(new JLabel("Segunda-Pergunta:"));
        Card3.add(new JLabel("Qual a fruta mais doce do mundo?"));
        Card3.add(new JTextField(25));

        // quarto Card
        JPanel Card4 = new JPanel();
        Card4.add(new JLabel("Terceira-Pergunta:"));
        Card4.add(new JLabel("Qual a pior fruta do mundo?"));
        Card4.add(new JTextField(25));

        // quinto Card
        JPanel Card5 = new JPanel();
        Card5.add(new JLabel("Quarta-Pergunta:"));
        Card5.add(new JLabel("Qual a fruta mais cara do mundo?"));
        Card5.add(new JTextField(25));

        // sexto Card
        JPanel Card6 = new JPanel();
        Card6.add(new JLabel("Quinta-Pergunta:"));
        Card6.add(new JLabel("Qual a fruta mais barata do mundo?"));
        Card6.add(new JTextField(25));

        // setimo Card
        JPanel Card7 = new JPanel();
        Card7.add(new JLabel("PARABENS!!!"));

        // criando os botões
        JButton bNext1 = new JButton("Start");
        JButton bNext2 = new JButton("Proximo");
        JButton bNext3 = new JButton("Proximo");
        JButton bNext4 = new JButton("Proximo");
        JButton bNext5 = new JButton("Proximo");
        JButton bNext6 = new JButton("Proximo");
        JButton bNext7 = new JButton("Jogar Novamente");

        // adicionando os botoes aos cards
        Card1.add(bNext1);
        Card2.add(bNext2);
        Card3.add(bNext3);
        Card4.add(bNext4);
        Card5.add(bNext5);
        Card6.add(bNext6);
        Card7.add(bNext7);

        // adicionando os cards ao mainP
        mainP.add(Card1);
        mainP.add(Card2);
        mainP.add(Card3);
        mainP.add(Card4);
        mainP.add(Card5);
        mainP.add(Card6);
        mainP.add(Card7);

        //card 4 - pontuacao
        JPanel card4 = new JPanel();
        card4.add(new JLabel("Resultado Final"));
        JLabel pontuacaoFinal = new JLabel();
        card4.add(pontuacaoFinal);
        //JButton bNext4 = new JButton("reiniciar");

        // set do frame
        this.add(mainP);
        this.setDefaultCloseOperation(2);
        this.setBounds(200, 200, 300, 300);
        this.setVisible(true);

        // colocando ações aos botões
        bNext1.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext2.addActionListener(e -> {
         if()
            cl.next(mainP);
        });

        bNext3.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext4.addActionListener(e -> {
            cl.next(mainP);

        });

        bNext5.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext6.addActionListener(e -> {
            cl.next(mainP);
        });

        bNext7.addActionListener(e -> {
            cl.next(mainP);
        });

    }
}
