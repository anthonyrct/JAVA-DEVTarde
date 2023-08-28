import javax.swing.JFrame;

public class GUISwingJFrameExemplo extends JFrame{
    public GUISwingJFrameExemplo() {
        super("Minha Primeira Janela GUI Swing");
        this.setSize(400, 400);//tamanho
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha o programa ao apertar o "X"
        this.setVisible(true);//Transforma a janela visivel
    }
}
