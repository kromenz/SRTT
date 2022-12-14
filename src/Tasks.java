import java.io.Serializable;

public class Tasks implements Serializable {

    private String idTask;
    private Users freelancer;
    private String taskStartDate;
    private String taskEndDate;
    private String Description;
    //private taskState state;

    public Tasks(){}; //Construtor tarefas


    public String getIdTask() {
        return idTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public Users getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Users freelancer) {
        this.freelancer = freelancer;
    }

    public String getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(String taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public String getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(String taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
