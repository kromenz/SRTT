import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Repository repo;
        Repository.deserialize("src\\data\\users.repo");
        repo=Repository.getRepository();
        if(repo.getAdmins().size() == 0){
            Admin a1 = new Admin();
            a1.setName("Administrador");
            a1.setBirthDate("2000-06-04");
            a1.setNIF("123456789");
            a1.setType("Admin");
            a1.setUsername("admin");
            a1.setPassword("admin123");
            AdminREP.createAdmin(a1);
        }
        LoginForm frameLogin = new LoginForm("SRTT");
        frameLogin.setVisible(true);
    }
}