
package travels.and.tourism.management.system;

import java.sql.*;

public class Conn {
    Connection c; //Connection string
    Statement s; // Statement cretaion
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ttms","root","ghimire2054");
            s = c.createStatement();
        }catch(Exception e){
        
        }
    }
    }
}
