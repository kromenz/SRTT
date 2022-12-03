import javax.swing.*;

public class UIForm extends JFrame {
    private JPanel menuPanel;
    private JPanel sidePanel;

    public UIForm(String title){
        super(title);
        this.setContentPane(this.menuPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

    }
}
