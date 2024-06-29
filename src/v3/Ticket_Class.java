/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ticket_Class extends Passenger{

    private String FlightCode, Number_of_Tickets;

    Connection Con = null;
    ResultSet Rs = null, Rsl = null;
    Statement St = null, Stl = null;

    public Ticket_Class(String email, String FlightCode, String Number_of_Tickets){
        super(email,"",false);
        this.FlightCode = FlightCode;
        this.Number_of_Tickets = Number_of_Tickets;

        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
            PreparedStatement Add = Con.prepareStatement("insert into ticket2 values(?,?,?)");
            Add.setString(1, this.getEmail());
            Add.setString(2, this.FlightCode);
            Add.setString(3,this.Number_of_Tickets);

            int row = Add.executeUpdate();
            Con.close();

        }catch (Exception e){
            System.err.println(e);
        }

    }

    public String getFlightCode(){
        return this.FlightCode;
    }

    public String getNumber_of_Tickets() {
        return Number_of_Tickets;
    }
}
