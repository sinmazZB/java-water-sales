
package appPack;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;


public class DBfuction {
 DB db = new DB();
 /**
  * 
  * @param username
  * @param userpass
  * @return 
  */
 
 public boolean adminlogin(String username, String userpass){
     boolean statu = false;
     
     
     try {
         String query = "SELECT * FROM `admin` WHERE `username` = ? AND `userpass` = ? ";
         java.sql.PreparedStatement pre = db.pre(query);
         pre.setString(1, username);
         pre.setString(2, userpass);
         ResultSet rs = pre.executeQuery();
         statu = rs.next();
     } catch (Exception e) {
         System.err.println("admin login eroro"+e);
         
     }
 return statu;
 
 }
    
    
    
    
    
    
    
}
