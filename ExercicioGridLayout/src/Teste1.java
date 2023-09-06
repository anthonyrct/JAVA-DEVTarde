import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Teste1 extends JFrame {
    public Teste1() {
        super("Janela Principal");
        // vamos adicionar um Jpanel
        JPanel painel = new JPanel();
        this.add(painel);
        // vamos modificar o Layout do Painel(JPainel) para flow-grid e adicionar as
        // rows e cols
        GridLayout grid = new GridLayout(4, 4);
        painel.setLayout(grid);
        // vamos adicionar os componentes ao Jpanel
        String valores[] = {"7","8","9","x","4","5","6","-","3","2","1","+","/","0",".","="};
        for (int i = 0; i < valores.length; i++) {
            painel.add(new JButton(valores[i]));
        }

        // set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);

    }
}
