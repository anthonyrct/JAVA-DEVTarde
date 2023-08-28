import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameUltizando extends JFrame {
    public JFrameUltizando() {
        super("Janela Principal");
        // setando a janela
        this.setBounds(500, 500, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// fecha a janela ao clicar no "X"
        // Ajustando o Layout da Janela
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        // adicional componentes
        for (int i = 0; i < 6; i++) {
            this.add(new JButton("" + i));
        }
        this.add(new JTextField("Meus Textos",15));
        this.setVisible(true);
    }
}
