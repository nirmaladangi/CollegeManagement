
package model;

import db.DBConnector;
import dto.EmpDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class RemoveUserAuthenticator
{
  public boolean isRemove(EmpDTO emp)
  {
    int update =0;
    
    String id =emp.getEmpId();
     try
     {
         Statement st=DBConnector.getStatement();
         
          String query= "DELETE FROM emp where empid = '"+id+"'";
           
           System.out.println("Query = "+query); 
           st.executeUpdate(query);
           
            if(update==1)
            {   
             System.out.println("execute query");
             return true;
           }
            else{
    
       return false;
            }
      }
      catch(SQLException e)
       {
         System.out.println(e);
       }
      return false;
     
   }  
}