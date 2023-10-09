package GUIEventExercicio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploTratamentoEvento extends JFrame {
    // atributos
    private JTextField caixaNome, caixaSobreNome;
    private JLabel nomeSobrenome;

    public ExemploTratamentoEvento() {
        // construtor

        super("Teste");
        // criando painel principal
        JPanel mainP = new JPanel(new GridLayout(3, 2));
        this.add(mainP);// adicionando o painel principal ao frame
        // adicionando os elementos/componentes ao painel
        mainP.add(new JLabel("Nome: "));
        caixaNome = new JTextField();
        mainP.add(caixaNome);
        mainP.add(new JLabel("SobreNome: "));
        JTextField caixasobreNome = new JTextField();
        mainP.add(caixasobreNome);
        JButton botao = new JButton("OK");
        mainP.add(botao);
        nomeSobrenome = new JLabel();
        mainP.add(nomeSobrenome);

        // set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(120, 120, 155, 155);
        this.setVisible(true);

        // metodo encurtado
        // botao.addActionListener(e->{
        // nomeSobrenome.setText(caixaNome.getText()+" "+caixasobreNome());
        // caixaNome.setText("");
        // caixasobreNome.setText("");
        // });
        // metodo normal
        // botao.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // nomeSobrenome.setText(caixaNome.getText() + " " + caixasobreNome.getText());
        // caixaNome.setText("");
        // caixasobreNome.setText("");
        // }});
        // chamar o handler(dentro do construtor)
        Handler evt = new Handler();
        botao.addActionListener(evt);

       
    }
    // tratamento por handler(manipulador)
    // criando handler
     // classe será criada fora do construtor
        public class Handler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                nomeSobrenome.setText(caixaNome.getText() + " " + caixaSobreNome.getText());
                caixaNome.setText("");
                caixaSobreNome.setText("");
            }

        }
}
