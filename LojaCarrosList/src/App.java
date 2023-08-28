import java.util.*;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    List<Carros> listacarros = new ArrayList<>();
    boolean aberto = true;
    while (aberto) {
      int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar \n2-listar"));
      if (acao == 1) {
        // 1. Cadrastrar Novo Carro.
        Carros c = new Carros();
        c.setMarca(JOptionPane.showInputDialog("Marca do Carro:"));
        c.setModelo(JOptionPane.showInputDialog("Modelo do Carro:"));
        c.setAno(JOptionPane.showInputDialog("Ano do Carro:"));
        c.setCor(JOptionPane.showInputDialog("Cor do Carro:"));
        listacarros.add(c);
      }else if(acao==2){
        // 2. Listar todos os Carros Cadastrados.
        String listar="";
        for (Carros carros : listacarros) {
          listar+=carros.getMarca()+""+carros.getModelo()+"\n";
        }
        JOptionPane.showMessageDialog(null, listar);
      }
    }

  }
  // -criar uma classe chamada carro, colocar atibutos e metodos-
  // -manipula essa classe no app.-
  // -criar uma list do tipo:List<Carros> lista carros = new ArrayList<>();-
  // dentro do app deve ser feito:
  // 1. Cadrastrar Novo Carro.
  // 2. Listar todos os Carros Cadastrados.
  // 3. Consultar um Carro Cadastro.
  // 4. Apagar um Carro Cadastrado.
}
