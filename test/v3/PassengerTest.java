/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package v3;



import org.junit.Before;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.After;


/**
 *
 * @author user
 */
public class PassengerTest {
    
    private Passenger passenger;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    @Test
    public void testGetEmail() throws SQLException {
        Passenger passenger = new Passenger("test@email.com", "testpassword", true);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        assertEquals("test@email.com", passenger.getEmail());
    }

    @Test
    public void testGetPassword() throws SQLException {
        Passenger passenger = new Passenger("test@email.com", "testpassword", true);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        assertEquals("testpassword", passenger.getPassword());
    }

    @After
    public void tearDown() throws SQLException {
        Passenger passenger = new Passenger("test@email.com", "testpassword", true);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        ps = con.prepareStatement("DELETE FROM login2 WHERE email='test@email.com' AND password='testpassword'");
        ps.executeUpdate();
        con.close();
    }
}