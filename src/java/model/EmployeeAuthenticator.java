
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class EmployeeAuthenticator 
{
  
 public boolean isEmployee(UserDTO user)  
 {
    String username = user.getUsername();
    String password = user.getPassword();
    String role = user.getRole();
    String tablePassword = "";
   
     
    try
    {
       Statement st=DBConnector.getStatement();
       String query = "SELECT emppassword FROM emp where empname ='"+username+"'";
               System.out.println("query = "+query);
               
           ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
               {
                tablePassword = rs.getString(1);
               }
    }   
   
  catch(SQLException e)
           {
               System.out.println(e);
           }
    if(username != null && password != null && !username.trim().equals("") && password.equals(tablePassword)&& role.equalsIgnoreCase("admin"))
        { 
            return true;
        }
     
       return false;      
 } 
 
   public String isRole(UserDTO user)
   {
       String username = user.getUsername();
       String password = user.getPassword();
       String tableRole="";
       
       try
       {
           Statement st = DBConnector.getStatement();
           String query = "select emprole from emp where empname = '" + username + "'";
           System.out.println("Query = " + query);
           
           ResultSet rs = st.executeQuery(query);
           if(rs.next())
           {
               System.out.println("execute query");
               tableRole = rs.getString(1);
           }
       }
       catch (SQLException e)
       {
           System.out.println(e);
       }
       return tableRole;
   }
}  
 
