
package model;

import db.DBConnector;
import dto.EmpDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class ViewProfileAuthenticator 
{
  public boolean isView(EmpDTO emp)
  {
    String id =emp.getEmpId();
    String role=emp.getEmpRole();
    String tablerole="";
   
    try
     {
         Statement st=DBConnector.getStatement();
         
          String query= "select emprole from emp where empid = '"+id+"'";
           
           System.out.println("Query = "+query); 
          ResultSet rs= st.executeQuery(query);
           
           if(rs.next())
               {
                   System.out.println("execute query");
                 tablerole = rs.getString(1);
               }      
      }
      catch(SQLException e)
       {
         System.out.println(e);
       }
      
    if(id != null &&  role != null && role.equals(role))
    {
         System.out.println(tablerole);
        return true;
    }
        return false;
  }
  
}
