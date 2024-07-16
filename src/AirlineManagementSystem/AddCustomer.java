package AirlineManagementSystem;

import AirlineManagementSystem.Config.Conn;

import javax.swing.*;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomer extends JFrame implements ActionListener {

    JTextField tfName, tfPhone, tfAadhar, tfNationality, tfAddress;
    JRadioButton rbMale, rbFemale;


    AddCustomer(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("New Customer Registration");

        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(240, 30, 500, 35);
        heading.setFont(new Font("Raleway", Font.PLAIN , 30));
        heading.setForeground(Color.BLUE);
        add(heading);

        //adding name label and field
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(20, 100, 200, 25);
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblName);

        tfName = new JTextField();
        tfName.setBounds(220, 100, 200, 25);
        add(tfName);

        //adding phone label and field
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(20, 140, 200, 25);
        lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblPhone);

        tfPhone = new JTextField();
        tfPhone.setBounds(220, 140, 200, 25);
        add(tfPhone);

        //adding aadhar label and field
        JLabel lblAadhar = new JLabel("Aadhar Number");
        lblAadhar.setBounds(20, 180, 200, 25);
        lblAadhar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblAadhar);

        tfAadhar = new JTextField();
        tfAadhar.setBounds(220, 180, 200, 25);
        add(tfAadhar);

        //Nationality label and field
        JLabel lblNationality = new JLabel("Nationality");
        lblNationality.setBounds(20, 220, 200, 25);
        lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblNationality);

        tfNationality = new JTextField();
        tfNationality.setBounds(220, 220, 200, 25);
        add(tfNationality);

        //Gender label and field
        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(20, 260, 200, 25);
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblGender);

        rbMale = new JRadioButton("Male");
        rbMale.setBounds(220, 260, 100, 25);
        rbMale.setBackground(Color.WHITE);
        add(rbMale);

        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(320, 260, 100, 25);
        rbFemale.setBackground(Color.WHITE);
        add(rbFemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);

        //Address label and field
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(20, 300, 200, 25);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblAddress);

        tfAddress = new JTextField();
        tfAddress.setBounds(220, 300, 200, 25);
        add(tfAddress);

        //adding save button
        JButton save = new JButton("Save");
        save.setBounds(150, 380, 100, 25);
        save.setForeground(Color.WHITE);
        save.setBackground(Color.BLACK);
        save.addActionListener(this);
        add(save);

        //adding bg image
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("AirlineManagementSystem/icons/emp.png"));
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(450, 80, 400, 400);
        add(imageLabel);



        setSize(900,600);
        setLocation(300, 150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //getting input values
        String name = tfName.getText();
        String nationality = tfNationality.getText();
        String phone = tfPhone.getText();
        String aadhar = tfAadhar.getText();
        String gender = null;
        if(rbMale.isSelected()){
            gender = "Male";
        }else if(rbFemale.isSelected()){
            gender = "Female";
        }
        String address = tfAddress.getText();

        //trying to connect to db and insert the input
        try{
            Conn conn = new Conn();

            String query = "insert into passenger values('"+name+"', '"+nationality+"', '"+phone+"', '"+address+"', '"+aadhar+"', '"+gender+"')";

            conn.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");

            setVisible(false);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    public static void main(String[] args){
        new AddCustomer();
    }


}
