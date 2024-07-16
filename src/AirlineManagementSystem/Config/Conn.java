package AirlineManagementSystem.Config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    public Statement s;

    public Conn() {
        //connecting with MySql database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Vintu@9766");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
