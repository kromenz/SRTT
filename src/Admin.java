import java.io.Serializable;
public class Admin implements Serializable {
    private String name;
    private String lastName;
    private String birthDate;
    private String NIF;
    private String username;
    private String password;
    private String type;

    public Admin(){};

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
    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
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
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
}
