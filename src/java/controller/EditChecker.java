
package controller;

import dto.EmpDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EditAuthenticator;


/**
 *
 * @author Nirmala
 */
public class EditChecker extends HttpServlet
{

   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       response.sendRedirect("adminlogin.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
     String username=request.getParameter("username");
       String id =request.getParameter("id");
       String password=request.getParameter("password");
       String salary = request.getParameter("salary");
       String city = request.getParameter("city");
       String department=request.getParameter("department");
       String contact_no=request.getParameter("contact_no");
       String date=request.getParameter("date");
       String role=request.getParameter("role");
       
       EmpDTO emp=new EmpDTO();
        emp.setEmpId(id);
        emp.setEmpName(username);
        emp.setEmpPassword(password);
        emp.setEmpSalary(salary);
        emp.setEmpCity(city);
        emp.setEmpDepartment(department);
        emp.setEmpContact_no(contact_no);
        emp.setEmpDate(date);
        emp.setEmpRole(role);
       
       EditAuthenticator authenticator = new EditAuthenticator();
        boolean edit = authenticator.isEdit(emp);
        //System.out.println(emp); 
        
        if(edit)
          {
            HttpSession session =request.getSession(true); 
            
             session.setAttribute("id",id);
            
             //session.setAttribute("role",role);
             response.sendRedirect("updateprofile.jsp");
             
          }
          else
          {
             response.sendRedirect("updateprofile.html");
          }
        }
  }
 

