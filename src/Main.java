import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Repository repo;
        Repository.deserialize("src\\data\\users.repo");
        LoginForm frameLogin = new LoginForm("SRTT");
        frameLogin.setVisible(true);
    }
}