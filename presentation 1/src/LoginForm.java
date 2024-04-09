import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    private JLabel emailLabel, passwordLabel, messageLabel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton, clearButton;

    public LoginForm() {
        createComponents();
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(loginButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(clearButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(messageLabel, constraints);

        setTitle("Login Form");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents() {
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        clearButton = new JButton("Clear");
        messageLabel = new JLabel("");

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if ("Akashboparai0001@gmail.com".equals(email) && "pures123".equals(password)) {
                messageLabel.setText("Login successful!");
            } else {
                messageLabel.setText("Invalid email or password.");
            }
        } else if (e.getSource() == clearButton) {
            emailField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}