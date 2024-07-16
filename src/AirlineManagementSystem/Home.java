package AirlineManagementSystem;

import AirlineManagementSystem.Config.Conn;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Home extends JFrame implements ActionListener {

    public Home(){
        setLayout(null);
        setTitle("Welcome to WeAir");

        //adding image on home page
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("AirlineManagementSystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);

        //Adding Welcome to WeAir Label
        JLabel lblWelcome = new JLabel("WeAir welcomes you!!!");
        lblWelcome.setBounds(580, 50, 1000, 40);
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblWelcome.setForeground(Color.BLUE);
        image.add(lblWelcome);

        //adding menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu details = new JMenu("Details");
        menuBar.add(details);


        //adding drop down menu for details
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);

        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);

        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);

        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);

        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);

        JMenu ticket = new JMenu("Ticket");
        menuBar.add(ticket);

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);



        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String text = e.getActionCommand();

        if (text.equals("Add Customer Details")) {
//            new AddCustomer();
        } else if (text.equals("Flight Details")) {
//            new FlightInfo();
        } else if (text.equals("Book Flight")) {
//            new BookFlight();
        } else if (text.equals("Journey Details")) {
//            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
//            new Cancel();
        }

    }

    public static void main(String[] args) {
        new Home();
    }


}