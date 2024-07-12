
package controller;

import dto.EmpDTO;
import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EmployeeAuthenticator;
import model.RegistrationAuthenticator;

/**
 *
 * @author Nirmala
 */
public class RegistrationChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       response.sendRedirect("registration.html");
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
       
       RegistrationAuthenticator authenticator = new RegistrationAuthenticator();
        boolean registration = authenticator.isRegistration(emp);
        System.out.println(role); 
        
        if(registration)
          {
            HttpSession session =request.getSession(true); 
             session.setAttribute("username",username);
             session.setAttribute("id",id);
             session.setAttribute("password",password);
             session.setAttribute("salary",salary);
             session.setAttribute("city",city);
             session.setAttribute("department",department);
             session.setAttribute("contact_no",contact_no);
             session.setAttribute("date",date);
             session.setAttribute("role",role);
             response.sendRedirect("addhome.jsp");
             
          }
          else
          {
             response.sendRedirect("registration.html");
          }
        
        
    }
}
