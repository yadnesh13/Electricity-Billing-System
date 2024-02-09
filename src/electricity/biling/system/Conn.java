package electricity.biling.system;

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_billing_system", "root","Yadnesh@#1303");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
     
    }
}
