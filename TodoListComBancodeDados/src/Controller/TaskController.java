package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Task;

public class TaskController {
    // atributos
    private List<Tarefa> tarefas;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public TaskController(List<Tarefa> tarefas, DefaultTableModel tableModel, JTable table) {
        this.tarefas = tarefas;
        this.tableModel = tableModel;
        this.table = table;}

        // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        tarefas = new TaskDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Tarefa tarefa : tarefas){
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addrow(new Object[]{tarefa.getDescricao()});
        }
    }
    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String tarefa){
        new TaskDAO().cadastrar(tarefa);
        // Chama o método de cadastro no banco de dados
        atualizarTabela();
    }

}
