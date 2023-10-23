import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TodoList extends JFrame {
    // atributos
    private JPanel mainPanel;
    private JTextField taskInputField;
    private JButton addButton;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton clearCompletedButton;
    private List<Task> tasks;

    // construtor
    public TodoList() {

        // Configuração da janela principal
        super("To-Do List App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 400);

        // Inicializa o painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        // Inicializa campos de entrada, botões e JComboBox
        taskInputField = new JTextField();
        addButton = new JButton("Adicionar");
        deleteButton = new JButton("Excluir");
        markDoneButton = new JButton("Concluir");
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas",
                "Concluídas" });
        clearCompletedButton = new JButton("Limpar Concluídas");

        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(deleteButton);
        buttonPanel.add(markDoneButton);
        buttonPanel.add(filterComboBox);
        buttonPanel.add(clearCompletedButton);

        // Adiciona os componentes ao painel principal
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal à janela
        this.add(mainPanel);

        // Tratamento de Eventos da Aplicação
        Handler evt = new Handler();
        addButton.addActionListener(evt);

        // Adiciona um KeyListener ao campo de entrada
        taskInputField.addKeyListener((KeyListener) new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask(); // Adiciona uma nova tarefa quando a tecla Enter é pressionada
                } else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    // Código para excluir tarefa quando a tecla Delete é pressionada
                    deleteTask();
                }
            }

        });

        // cores
        //taskList.setBackground(new Color(112, 66, 20));
    }

    // metodo que torna a janela visivel
    public void run() {
        this.setVisible(true);
    }

    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        String taskDescription = taskInputField.getText().trim();// remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            taskInputField.setText("");
        }
    }

    private void deleteTask() {
        // Lógica para excluir a tarefa selecionada
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
            updateTaskList();
        }
    }

    private void updateTaskList() {
        // Limpa o listModel antes de adicionar as novas tarefas
        listModel.clear();

        // Adiciona as descrições das tarefas ao listModel
        for (Task task : tasks) {
            listModel.addElement(task.getDescripition());
        }

        // Define o listModel no JList para atualizar a exibição das tarefas
        taskList.setModel(listModel);
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.run();
    }

    public class Handler implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                addTask();
            }

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedIndex = taskList.getSelectedIndex();
                    if (selectedIndex >= 0) {
                        tasks.remove(selectedIndex);
                        updateTaskList();
                    }
                }
            });
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Lógica para lidar com eventos de teclado
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                markTaskAsDone();
                // Código para marcar a tarefa como concluída quando a tecla Espaço é
                // pressionada

            } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                deleteTask();
                updateTaskList();
            }
        }

        private void markTaskAsDone() {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                Task selectedTask = tasks.get(selectedIndex);
                selectedTask.setDone(true); // Marca a tarefa como concluída (você deve ter um método setDone na sua
                                            // classe Task)
                updateTaskList();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Métodos não utilizados, mas necessários devido à implementação da interface
            // KeyListener
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // Métodos não utilizados, mas necessários devido à implementação da interface
            // KeyListener
        }
    }
}
