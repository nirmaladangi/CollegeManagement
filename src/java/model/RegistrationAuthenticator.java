
package model;

import db.DBConnector;
import dto.EmpDTO;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nirmala
 */
public class RegistrationAuthenticator
{
    public boolean isRegistration(EmpDTO emp)
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
         Statement st=DBConnector.getStatement();
         
          String query="insert into emp(empname,empid,emppassword,empjoining_date,empsalary,empdepartment,emprole,empcity,empcontact_no) values('"+username+"','"+id+"','"+password+"','"+date+"','"+salary+"','"+department+"','"+role+"','"+city+"','"+contact_no+"')";

           
           System.out.println("Query = "+query);

         
          
          st.executeUpdate(query);
         
      }
     catch(SQLException e)
       {
         System.out.println(e);
       }
     
      if(id!= null && username != null && password != null && date != null && salary != null && city !=null && contact_no !=null && role != null )
        { 
            return true;
        }
    
       return false;      
   }  

     
}
