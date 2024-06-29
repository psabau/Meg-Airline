
package v3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Passenger {
    private String email, password;
    boolean add_to_db=true;

    Connection Con = null;
    ResultSet Rs = null, Rsl = null;
    Statement St = null, Stl = null;

    public Passenger(String email, String password, boolean add){
        this.email = email;
        this.password = password;
        this.add_to_db = add;
        
        if(add_to_db == true){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megairlinedb", "root", "");
            PreparedStatement Add = Con.prepareStatement("insert into login2 values(?,?)");
            Add.setString(1,this.email);
            Add.setString(2,this.password);

            int row = Add.executeUpdate();
            Con.close();

        }catch (Exception e){
            System.err.println(e);
        }
    }
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    void TicketPurchased(boolean smth){
        smth = true;
    }
}
