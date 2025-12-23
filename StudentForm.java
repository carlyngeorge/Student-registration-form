import javax.swing.*;
import java.awt.*;

public class StudentForm {

    JFrame frame;
    JTextField nameField, ageField, courseField;

    public StudentForm() {
        frame = new JFrame("Student Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Course:"));
        courseField = new JTextField();
        panel.add(courseField);

        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> handleSubmit());

        panel.add(new JLabel());
        panel.add(submitBtn);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void handleSubmit() {
        Student student = new Student(
                nameField.getText(),
                ageField.getText(),
                courseField.getText()
        );

        if (!ValidationUtil.validateStudent(student)) {
            JOptionPane.showMessageDialog(frame, "All fields are required!");
        } else {
            JOptionPane.showMessageDialog(frame, "Student Registered Successfully!");
        }
    }
}
