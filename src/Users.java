import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Users implements Serializable {

    private String name;
    private String lastName;
    private String birthDate;
    private String gener;
    private String username;
    private String password;
    private int NIF;
    private String type;

    private List<Project> projects;

    public Users(){this.projects = new ArrayList<>();} //Construtor

    public List<Project> getProjects(){return projects;} //getter das tarefas

    public void ListProjects(){
        int numProjects = 1;
        for(Project pj : this.projects){
            System.out.println("Nº Projeto: " + numProjects);

        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getGener() {
        return gener;
    }
    public void setGener(String gener) {
        this.gener = gener;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getNIF() {
        return NIF;
    }
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

