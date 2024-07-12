
package model;

import db.DBConnector;
import dto.EmpDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class EditAuthenticator
{
  public boolean isEdit(EmpDTO emp)
  {
     String username=emp.getEmpName();
     String id =emp.getEmpId();
     String password=emp.getEmpPassword();
     String salary=emp.getEmpSalary();
     String city=emp.getEmpCity();
     String department=emp.getEmpDepartment();
     String contact_no=emp.getEmpContact_no();
     String date = emp.getEmpDate();
     String role =emp.getEmpRole();
     
     try
     {
        int update=0;
        Statement st=DBConnector.getStatement();
        String  query ="update emp set empname='" +username+"',emppassword='" + password + "',empjoining_date='" +date + "',empsalary='" +salary + "',empdepartment='" + department + "',emprole='" + role + "',empcity ='"+city+"',empcontact_no='"+contact_no+"',empid = '"+id+"'";         
        System.out.println("Query=" + query);
        
        update = st.executeUpdate(query);
         
         
        if(update == 1)
        {
          System.out.println("execute query");
         if(username != null && id != null && password != null && date != null && salary != null && department != null && role != null && city != null && contact_no != null)
         {   
             return true;
         }       
      }
    }
     catch(SQLException e)
     {
         System.out.println(e);
     }
     return false;
}
}