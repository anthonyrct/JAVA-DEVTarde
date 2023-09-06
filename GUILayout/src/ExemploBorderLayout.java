import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        super("Janela");
        //adicionando o Jpanel e definir o Layout
        JPanel painel = new JPanel(new BorderLayout());
        this.add(painel);
        //adicionando componentes
        painel.add(new JButton("South"),BorderLayout.SOUTH);
        painel.add(new JTextField(25),BorderLayout.NORTH);
        painel.add(new JButton("East"),BorderLayout.EAST);
        painel.add(new JButton("West"),BorderLayout.WEST);
        painel.add(new JButton("Center"),BorderLayout.CENTER);

        // set Frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
