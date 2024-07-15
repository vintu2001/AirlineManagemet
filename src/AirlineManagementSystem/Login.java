package AirlineManagementSystem;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton btnReset,btnLogin, btnCancel;
    JTextField tfUsername,pfPassword;

    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("WeAir Login");

        //adding username label and field
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(20, 20, 100,25);
        add(lblUsername);

        tfUsername = new JTextField();
        tfUsername.setBounds(120, 20, 200, 25);
        add(tfUsername);

        //adding password label and field
        JLabel  lblPassword = new JLabel("Password");
        lblPassword.setBounds(20, 60, 100, 25);
        add(lblPassword);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(120, 60, 200, 20);
        add(pfPassword);

        //adding buttons
        btnReset = new JButton("Reset");
        btnReset.setBounds(60, 110, 100, 25);
        btnReset.addActionListener(this);
        add(btnReset);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(230, 110, 100, 25);
        btnLogin.addActionListener(this);
        add(btnLogin);

        btnCancel = new JButton("Cancle");
        btnCancel.setBounds(150, 160, 100, 25);
        btnCancel.addActionListener(this);
        add(btnCancel);

        setSize(400,250);
        setLocation(600,250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //adding functionality to buttons
        if(e.getSource() == btnLogin){
            //showing popup for login successful for testing
            JOptionPane.showMessageDialog(null, "You have successfully logged in");

        }else if(e.getSource() == btnCancel){
            setVisible(false);
        }else if(e.getSource() == btnReset){
            tfUsername.setText("");
            pfPassword.setText("");
            JOptionPane.showMessageDialog(null, "Reset Successful");
        }


    }

    public static void main(String[] args) {
        new Login();
    }


}