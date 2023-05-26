
package tms;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

//connectivity
public class Conn {

    Connection c;
    
    
     //[ step 3 ] Creating the statement.
    Statement s;
        Conn(){
            //bcz of run time handling
            try {
                //[ step 1 ] initializing the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //[ step 2 ] Creating the connectin strings by using CONNECTION INTERFACES
                c = DriverManager.getConnection("jdbc:mysql:///travel","root","@KHIZAR][19859118");
                s= c.createStatement();
                
               // use travel;
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
    
}
