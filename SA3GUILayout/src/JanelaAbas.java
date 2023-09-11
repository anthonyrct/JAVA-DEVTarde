import javax.swing.JTabbedPane;

public class JanelaAbas extends JTabbedPane{
    public JanelaAbas() {
        super();
        //add calculadora as abas
        this.add("Calculadora1", new Calculadora1());
        this.add("Calculadora2", new Calculadora2());
        this.add("Calculadora3", new Calculadora3());
    }
}
