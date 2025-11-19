package taskmanager.app;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import taskmanager.model.Task;
import taskmanager.model.TaskStatus;
import taskmanager.service.TaskService;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static TaskService taskService = new TaskService();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar Nova Tarefa");
            System.out.println("2 - Listar Tarefas Pendentes");
            System.out.println("3 - Listar Tarefas Concluídas");
            System.out.println("4 - Marcar Tarefa como Concluída");
            System.out.println("5 - Excluir Tarefa");
            System.out.println("6 - Listar TODAS as Tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite apenas números.");
            }
            sc.nextLine(); // Limpa o buffer do "Enter"

            switch (choice) {
                case 1:
                    handleAddTask();
                    break;
                case 2:
                    handleListTasksByStatus(TaskStatus.PENDING);
                    break;
                case 3:
                    handleListTasksByStatus(TaskStatus.COMPLETED);
                    break;
                case 4:
                    handleUpdateStatus();
                    break;
                case 5:
                    handleDeleteTask();
                    break;
                case 6:
                    handleListAll();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // --- Métodos Auxiliares ---

    private static void handleAddTask() {
        System.out.println("\n--- Nova Tarefa ---");
        System.out.print("Título: ");
        String title = sc.nextLine();

        System.out.print("Descrição: ");
        String description = sc.nextLine();

        LocalDate date = null;
        while (date == null) {
            System.out.print("Data de Vencimento (aaaa-mm-dd): ");
            String dateStr = sc.nextLine();
            try {
                date = LocalDate.parse(dateStr);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Use o formato aaaa-mm-dd (ex: 2025-12-30)");
            }
        }

        taskService.addTask(title, description, date);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void handleListTasksByStatus(TaskStatus status) {
        System.out.println("\n--- Tarefas " + status + " ---");
        List<Task> tasks = taskService.getTasksByStatus(status);

        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            // Method Reference: jeito chique de fazer "for (Task t : tasks) System.out.println(t)"
            tasks.forEach(System.out::println); 
        }
    }
    
    private static void handleListAll() {
        System.out.println("\n--- Todas as Tarefas ---");
        List<Task> tasks = taskService.getAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    private static void handleUpdateStatus() {
        System.out.print("Digite o ID da tarefa para concluir: ");
        try {
            int id = sc.nextInt();
            sc.nextLine(); // Limpa buffer
            taskService.updateTaskStatus(id, TaskStatus.COMPLETED);
        } catch (Exception e) {
            System.out.println("ID inválido. Digite um número.");
            sc.nextLine(); // Limpa buffer do erro
        }
    }

    private static void handleDeleteTask() {
        System.out.print("Digite o ID da tarefa para excluir: ");
        try {
            int id = sc.nextInt();
            sc.nextLine(); // Limpa buffer
            taskService.deleteTask(id);
        } catch (Exception e) {
            System.out.println("ID inválido. Digite um número.");
            sc.nextLine(); // Limpa buffer do erro
        }
    }
}