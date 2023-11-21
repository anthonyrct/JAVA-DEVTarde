package Controller;

import Model.Carros;
import Model.Cliente;
import Model.Venda;

import java.util.List;

import Controller.VendaDAO;

public class VendaController {
    private VendaDAO vendaDAO;

    public VendaController() {
        this.vendaDAO = new VendaDAO();
    }

    public void registrarVenda(Cliente cliente, List<Carros> carros, double valorTotal) {
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setCarros(carros);
        venda.setValorTotal(valorTotal);

        vendaDAO.registrarVenda(venda);
    }

    public void editarVenda(int vendaId, Cliente novoCliente, List<Carros> novosCarros, double novoValorTotal) {
        Venda venda = vendaDAO.getVendaById(vendaId);
        if (venda != null) {
            // Atualiza os dados da venda
            venda.setCliente(novoCliente);
            venda.setCarros(novosCarros);
            venda.setValorTotal(novoValorTotal);

            // Chama o método de atualização no DAO
            vendaDAO.atualizarVenda(venda);
        } else {
            System.out.println("Venda não encontrada.");
        }
    }

    public void excluirVenda(int vendaId) {
        Venda venda = vendaDAO.getVendaById(vendaId);
        if (venda != null) {
            // Chama o método de exclusão no DAO
            vendaDAO.excluirVenda(venda);
        } else {
            System.out.println("Venda não encontrada.");
        }
    }

    public List<Venda> visualizarVendasCliente(Cliente cliente) {
        // Retorna a lista de vendas associadas a um cliente
        return vendaDAO.getVendasByCliente(cliente);
    }

    public List<Venda> visualizarVendas() {
        // Retorna a lista de todas as vendas
        return vendaDAO.listarTodasVendas();
    }
}

