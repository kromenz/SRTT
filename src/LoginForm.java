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

            }
        });
    }
}
