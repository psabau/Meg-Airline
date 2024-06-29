
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

public class Ticket_ClassTest {
    
    private Ticket_Class ticket;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    @Before
    public void setUp() throws SQLException {
        
    }

    @Test
    public void testGetFlightCode() throws SQLException {
        Ticket_Class ticket = new Ticket_Class("test@email.com", "F001", "2");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        assertEquals("F001", ticket.getFlightCode());
    }

    @Test
    public void testGetNumberOfTickets() throws SQLException {
        Ticket_Class ticket = new Ticket_Class("test@email.com", "F001", "2");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        assertEquals("2", ticket.getNumber_of_Tickets());
    }

    @After
    public void tearDown() throws SQLException {
        Ticket_Class ticket = new Ticket_Class("test@email.com", "F001", "2");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
        Statement st = con.createStatement();
        ps = con.prepareStatement("DELETE FROM ticket2 WHERE email='test@email.com' AND flight_code='F001' AND number_of_tickets='2'");
        ps.executeUpdate();
        con.close();
    }
}