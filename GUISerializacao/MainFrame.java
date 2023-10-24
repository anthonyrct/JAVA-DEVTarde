package GUISerializacao;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{
    //construtor
    public MainFrame() {
        super("Frame Principal");
        setDefaultCloseOperation(2);
        //abas do JPanel
        JTabbedPane abas = new JTabbedPane();
        abas.add("Cadastro Usuarios", new CadastroUsuarios());
        //adicionandos abas de CadastroDeAgendamento
        abas.add("Agendamento" , new CadastroAgendamento());
        add(abas);
        
    }
    public void run(){
        pack();
        setVisible(true);
    }
}
