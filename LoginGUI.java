import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class LoginGUI implements ActionListener {
    JFrame frame;
    JLabel userLabel, passwordLabel, messageLabel;
    JTextField userTextField, passwordTextField;
    JButton loginButton;

    public LoginGUI() {
        // Create the main frame
        frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Initialize components
        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        userTextField = new JTextField(20);
        passwordTextField = new JPasswordField(20); // Use JPasswordField for password input
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");

        // Add action listener to the login button
        loginButton.addActionListener(this);

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userTextField);
        frame.add(passwordLabel);
        frame.add(passwordTextField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String enteredUsername = userTextField.getText().trim();
            String enteredPassword = passwordTextField.getText().trim();

            // Read data from the file
            try (BufferedReader reader = new BufferedReader(new FileReader("login.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(" ");
                    if (data.length == 3) {
                        String userId = data[0];
                        String storedUsername = data[1];
                        String storedPassword = data[2];

                        // Check if entered credentials match stored data
                        if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                            messageLabel.setText("Welcome " + storedUsername);
                            return;
                        }
                    }
                }
                messageLabel.setText("Invalid username or password");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new LoginGUI();
    }
}  
