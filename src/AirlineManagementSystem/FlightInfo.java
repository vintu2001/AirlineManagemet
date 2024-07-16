package AirlineManagementSystem;

import AirlineManagementSystem.Config.Conn;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FlightInfo extends JFrame implements ActionListener {

    FlightInfo(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Flight Information");

        //creating a table to show flight data
        JTable table = new JTable();

        //getting data from db and storing it into table
        try{
            Conn conn = new Conn();
            ResultSet  rs = conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }

        //adding scroll bar to table
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 800, 500);
        add(pane);


        setSize(800, 500);
        setLocation(400, 200);



        setVisible(true);
    }

    @Override

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        new FlightInfo();
    }
}
