package Controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Carros;
import Model.Cliente;
import Model.Venda;

public class VendaDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/seubanco";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private Connection connection;

    public VendaDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void registrarVenda(Venda venda) {
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            // Implemente a lógica de registro de venda no banco de dados
            // Utilize PreparedStatement para evitar SQL injection
            String sql = "INSERT INTO venda (cliente_id, valor_total) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setInt(1, venda.getCliente().getCpf());
                preparedStatement.setDouble(2, venda.getValorTotal());
                preparedStatement.executeUpdate();

                // Recupera a chave gerada para a venda
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    int vendaId = resultSet.getInt(1);
                    // Agora, insira os detalhes da venda na tabela de detalhes de venda
                    inserirDetalhesVenda(connection, vendaId, venda.getCarros());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirDetalhesVenda(Connection connection2, int vendaId, List<Carros> carros) {
    }

    public Venda getVendaById(int vendaId) {
        return null;
    }

    public void atualizarVenda(Venda venda) {
    }

    public void excluirVenda(Venda venda) {
    }

    public List<Venda> getVendasByCliente(Cliente cliente) {
        return null;
    }

    public List<Venda> listarTodasVendas() {
        return null;
    }
}
// Outros métodos para editar, excluir e recuperar vendas
