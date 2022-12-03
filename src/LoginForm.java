import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{

    private JTextField tF_LoginUsername;

    private JPasswordField pF_LoginPass;

    private JButton loginButton;

    private JButton registarButton;
    private JPanel LoginPanel;

    public LoginForm(String title){
        super(title);
        this.setContentPane(this.LoginPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean exist = false;

                try{
                    Repository repo;
                    repo = Repository.getRepository();

                    for(Users user : repo.getUsers().values()){
                        if(user.getUsername().equalsIgnoreCase(tF_LoginUsername.getText()) && user.getPassword().equals(pF_LoginPass.getText())){
                            exist = true;
                            dispose();
                            UIForm uiForm = new UIForm("Menu Utilizador");
                            uiForm.setVisible(true);
                        }
                    }
                    if(!exist){
                        JOptionPane.showMessageDialog(null,"Utilizador/Password erradas!");
                    }
                }catch (Exception ex){
                    System.out.println("Erro: " + ex.getMessage());
                }
            }
        });
        registarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                RegisterForm registerForm = new RegisterForm("Registar");
                registerForm.setVisible(true);
            }

        });
    }
}
