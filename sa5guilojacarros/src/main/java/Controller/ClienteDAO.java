package Controller;

import java.sql.Connection;

import Connection.ConnectionFactory;
import Model.Cliente;

public class ClienteDAO {
      private Connection connection;

    public ClienteDAO() {
        this.connection = ConnectionFactory.getConnection();
        //implementar a logica de cadastro no banco de dados
    }
    //adicionar os metodos de editar, excluir e recuperar os clientes

    public void cadastrarCliente(Cliente cliente) {
    }
}
