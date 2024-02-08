package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.print.DocFlavor.STRING;

import Connection.ConnectionFactory;
import Model.Task;

public class TaskDAO {
    // atributos
    private Connection connection;
    private List<Task> tasks;

    // construtor
    public void criaTabela() {
        String sql = "CREATE IF NOT EXIST TAREFA_TASKS (TAREFA VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela Criada Com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // listar todos os valores cadastrados
    public List<Carros> ListarTodos() {
        PreparedStatement stmt = null;
        // Declaração do objeto PreparedStatement para executar a consulta
        ResultSet rs = null;
        // Declaração do objeto ResultSet para armazenar os resultados da consulta
        tasks = new ArrayList<>();
        // Cria uma lista para armazenar os carros recuperados do banco de dados

        try{
            stmt = connection.prepareStatement("SELECT * TAREFA_TASKS");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()){
                Task tarefa = new Task(
                    rs.getString("descricao")
                );
                tasks.add(tarefa);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(connection, smt, rs);
            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return tasks;
    }
    public void cadastrar(String descricao){
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO TAREFA_TASKS(descricao) VALUE(?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, descricao);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch(SQLException e){
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}
