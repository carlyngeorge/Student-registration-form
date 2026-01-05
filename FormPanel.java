import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    JTextField nameField, ageField, courseField;
    JButton submitButton;
    JFrame parentFrame;

    public FormPanel(JFrame frame) {
        this.parentFrame = frame;

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        add(new JLabel()); l

        submitButton = new JButton("Register");
        add(submitButton);

        new FormActions(submitButton, nameField, ageField, courseField, parentFrame);
    }
}
