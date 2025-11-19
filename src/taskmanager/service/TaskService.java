package taskmanager.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import taskmanager.model.Task;
import taskmanager.model.TaskStatus;

public class TaskService {

    private List<Task> taskList;
    private int nextId;

    public TaskService() {
        this.taskList = new ArrayList<>();
        this.nextId = 1; // ID começa em 1
    }

    // --- CRUD ---

    // CREATE
    public void addTask(String title, String description, LocalDate dueDate) {
        Task newTask = new Task(nextId, title, description, dueDate);
        taskList.add(newTask);
        nextId++;
    }

    // READ (Todas)
    public List<Task> getAllTasks() {
        return taskList;
    }

    // READ (Por Status) - Nome corrigido para Plural (getTasks)
    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskList.stream()
                .filter(task -> task.getStatus() == status)
                .collect(Collectors.toList());
    }

    // UPDATE
    public void updateTaskStatus(int id, TaskStatus newStatus) {
        // Nome da variável corrigido para clareza
        Task taskToUpdate = taskList.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);

        if (taskToUpdate != null) {
            taskToUpdate.setStatus(newStatus);
            System.out.println("Sucesso: Status da tarefa " + id + " atualizado para " + newStatus);
        } else {
            System.out.println("Erro: Tarefa com ID " + id + " não encontrada.");
        }
    }

    // DELETE
    public void deleteTask(int id) {
        // Usando removeIf para remover se encontrar o ID
        boolean removed = taskList.removeIf(task -> task.getId() == id);

        if (removed) {
            System.out.println("Sucesso: Tarefa " + id + " removida.");
        } else {
            System.out.println("Erro: Tarefa com ID " + id + " não encontrada.");
        }
    }
}