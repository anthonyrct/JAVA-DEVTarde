import java.awt.Frame;
public class AWTFrameExemplo extends Frame{
    //construtor
    public AWTFrameExemplo() {
        super("Minha Primeira Janela AWT");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(false);
    }
}
