package Controller;

import Model.Cliente;
import Controller.ClienteDAO;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    public void cadastrarCliente(String cpf, String nome, String endereco, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);

        clienteDAO.cadastrarCliente(cliente);
    }
}
