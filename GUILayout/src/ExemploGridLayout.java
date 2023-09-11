import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExemploGridLayout extends JFrame{
  public ExemploGridLayout() {
    super("Janela Principal");
    //add um Jpanel
    JPanel painel = new JPanel();
    this.add(painel);
    //modificar o Layout do Painel (Jpanel) flow->Grid
    GridLayout grid = new GridLayout(2,2);
    painel.setLayout(grid);
    //add dos componentes ao Jpanel
    for (int i = 0; i < 4; i++) {
        JButton but = new JButton(""+i);
        but.setForeground(Color.RED);
        but.setBackground(Color.GREEN);
        painel.add(but);
    }
    //set do frame
    this.setDefaultCloseOperation(2);
    this.pack();
    this.setVisible(true);
  }  
}
