package taskmanager.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {

    private int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;

    // Construtor: Recebe os dados variáveis e define o status fixo como PENDING
    public Task(int id, String title, String description, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = TaskStatus.PENDING; 
    }

    // --- Getters e Setters ---

    public int getId() {
        return id;
    }
    // Não criamos setId pois o ID é controlado pelo Service

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // toString formatado para exibir bonito no console
    @Override
    public String toString() {
        // Formata a data para o padrão brasileiro (dia/mês/ano) para exibição
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        return "\n----------------------------" +
               "\nID: " + id +
               "\nTítulo: " + title +
               "\nDescrição: " + description +
               "\nData: " + dueDate.format(fmt) +
               "\nStatus: " + status;
    }
}