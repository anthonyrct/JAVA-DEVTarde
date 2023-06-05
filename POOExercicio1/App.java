package POOExercicio1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
       //criar um objeto da classe pessoa
       Pessoa pessoa1 = new Pessoa("Fabiana", 1.67, 15, 4 , 1997);
       pessoa1.imprimir();
       JOptionPane.showMessageDialog(null,"Idade: " +pessoa1.idade());pessoa1.idade();

    }
}
