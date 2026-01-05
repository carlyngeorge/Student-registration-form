import javax.swing.*;
import java.awt.event.*;

public class FormActions {

    public FormActions(JButton button, JTextField name, JTextField age,
                       JTextField course, JFrame frame) {

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = name.getText();
                String a = age.getText();
                String c = course.getText();

                if (n.isEmpty() || a.isEmpty() || c.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "All fields are required!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Student Registered Successfully!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
