import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerComponentes extends JFrame{
    //atributos
    int cont = 0;
    public ContainerComponentes() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Criar um outro container
        JPanel painel1 = new JPanel();
        this.add(painel1);
       JButton botao1 = new JButton("Clique Aqui");
       JLabel texto1 = new JLabel("número de vezes clicadas:");
       painel1.add(botao1);
       painel1.add(texto1);
        this.setVisible(true);
        botao1.addActionListener(e ->{
        cont++;
        texto1.setText("Número de cliques é:"+cont);
        });
        //adicionar um Jbutton e um Jlabel ao painel1
        //criar uma função(addActionListener)
        //toda vez que apertar o botão, ele conte a quantidade de clicks ao botão
    }
}
