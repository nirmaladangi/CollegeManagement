
package dao;

import db.DBConnector;
import dto.EmpDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class EmpDAO 
{
  public EmpDTO getempdata(String id)  
  {
    EmpDTO emp = new EmpDTO();
    String userid =id;
    
    try
    {
       Statement st = DBConnector.getStatement();
       String query ="select * from emp where empname = '"+userid+"'";
       System.out.println("Query=" + query);
       ResultSet rs = st.executeQuery(query);
       
       if(rs.next())
       {
           emp.setEmpId(rs.getString(1));
           emp.setEmpName(rs.getString(2));
           emp.setEmpPassword(rs.getString(3));
           emp.setEmpSalary(rs.getString(4));
       }
    }
        catch (SQLException e)
           {
            System.out.println(e);    
           }
     return emp;
  }  
}
