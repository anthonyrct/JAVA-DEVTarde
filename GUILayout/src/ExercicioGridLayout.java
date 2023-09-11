import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExercicioGridLayout extends JFrame {
    public ExercicioGridLayout() {
        super("Janela Principal");
        // add um Jpanel
        JPanel painel = new JPanel();
        this.add(painel);
        // modificar o Layout do Painel(Jpanel) flow->Grid
        GridLayout grid = new GridLayout(4, 4);
        painel.setLayout(grid);
        // add dos componentes ao Jpanel
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