import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame {
    private JPanel RegisterPanel;
    private JTextField tF_LoginUsername;
    private JPasswordField pF_LoginPass;
    private JButton registarButton;
    private JComboBox cBSexo;
    private JTextField tFNome;
    private JTextField tFSobrenome;
    private JTextField tFData;

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

            }
        });
    }
}
