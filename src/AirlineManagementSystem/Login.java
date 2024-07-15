package AirlineManagementSystem;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.*;

public class Login extends JFrame {

    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("WeAir Login");

        //adding username label and field
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(20, 20, 100,25);
        add(lblUsername);

        JTextField tfUsername = new JTextField();
        tfUsername.setBounds(120, 20, 200, 25);
        add(tfUsername);

        //adding password label and field
        JLabel  lblPassword = new JLabel("Password");
        lblPassword.setBounds(20, 60, 100, 25);
        add(lblPassword);

        JPasswordField pfPassword = new JPasswordField();
        pfPassword.setBounds(120, 60, 200, 20);
        add(pfPassword);

        //adding buttons
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(60, 110, 100, 25);
        add(btnReset);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(230, 110, 100, 25);
        add(btnLogin);

        JButton btnCancle = new JButton("Cancle");
        btnCancle.setBounds(150, 160, 100, 25);
        add(btnCancle);

        setSize(400,250);
        setLocation(600,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}