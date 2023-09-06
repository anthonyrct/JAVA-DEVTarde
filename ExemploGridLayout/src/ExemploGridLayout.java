import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        super("Janela Principal");
        //adicionando o painel
        JPanel painel = new JPanel();
        this.add(painel);
        //modificar o Layout do painel(Jpanel) flow-Grid
        GridLayout grid = new GridLayout(2,2);
        painel.setLayout(grid);
        //adicionando os componentes ao Japnel
        for (int i = 0; i < 4; i++) {
            painel.add(new JButton(""+i));
        } 

        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
    
}
