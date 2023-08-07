package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tentenovamente = true;
        String senha;
        String login;
        String dataNascimento;
        while (tentenovamente) {
            try {

                senha = JOptionPane.showInputDialog("Informe uma Senha");
                login = JOptionPane.showInputDialog("informe um Login");
                dataNascimento = JOptionPane.showInputDialog("Informe sua data de NAscimento [dd/mm/aaaa]");
                dataNascimento = dataNascimento.replace("/", "");
                if (senha.length() < 8) {
                    throw new Exception("Senha < 8 Caracteres");
                }
                if (senha.equals(login)) {
                    throw new Exception("Senha Não pode ser Igual ao Login");
                }
                tentenovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadatrada com Sucesso", "senha", 1);
                JOptionPane.showMessageDialog(null, "Login Feito com Sucesso", "login", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
            }
        }
    }
}
