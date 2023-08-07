package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        // teste tey-catch-finally
        String fraseInicial = null;
        String fraseFinal = null;
        fraseInicial = JOptionPane.showInputDialog("digite uma Frase");
        if (fraseInicial.equals("")) {
            fraseInicial = null;
        }
        try {

            fraseFinal = fraseInicial.toUpperCase();
        } catch (Exception e) {

            fraseInicial = "Não foi digitado uma Frase";
        } finally {

            JOptionPane.showMessageDialog(null, fraseFinal);
        }
    }
}
