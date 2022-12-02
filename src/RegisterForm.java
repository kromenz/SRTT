import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class RegisterForm extends JFrame {
    private JPanel RegisterPanel;
    private JTextField tF_LoginUsername;
    private JPasswordField pF_LoginPass;
    private JButton registarButton;
    private JComboBox cBSexo;
    private JTextField tFNome;
    private JTextField tFSobrenome;
    private JTextField tFData;
    private JTextField tFNIF;
    private JLabel labelMensagemErro;

    class SexoItem {
        private String key;
        private String value;

        public SexoItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public RegisterForm(String title) {
        super(title);
        this.setContentPane(this.RegisterPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        this.cBSexo.addItem(new SexoItem("Masculino", "M"));
        this.cBSexo.addItem(new SexoItem("Feminino", "F"));

        registarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obter os dados inseridos
                Users newUser = new Users();
                newUser.setNIF(Integer.valueOf(tFNIF.getText().toString()));
                newUser.setName(tFNome.getText().toString());
                newUser.setLastName(tFSobrenome.getText().toString());
                newUser.setBirthDate(tFData.getText().toString());
                newUser.setGener(((SexoItem) cBSexo.getSelectedItem()).getValue().toString());
                newUser.setUsername(tF_LoginUsername.getText().toString());
                newUser.setPassword(pF_LoginPass.getPassword().toString());
                newUser.setType("Freelancer");

                UsersREP.createUsers(newUser);
                labelMensagemErro.setText("Utilizador registado! Bem-Vindo " + newUser.getName());
                try{
                    Main.repo.registarUser(newUser);
                }catch (LoginException ex){
                    labelMensagemErro.setText("Erro: " + ex.getMessage());
                }
            }
        });
    }
}
