
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EmployeeAuthenticator;

/**
 *
 * @author Nirmala
 */
public class EmployeeChecker extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {  
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       String role=request.getParameter("role");
       
       UserDTO user = new UserDTO();
       user.setUsername(username);
       user.setPassword(password);
       user.setRole(role);
       
       EmployeeAuthenticator authenticator = new EmployeeAuthenticator();
        boolean employee = authenticator.isEmployee(user);
        System.out.println(role);
      if(employee)
           {
            if(role.equalsIgnoreCase("admin") && role.equals(role))
            {
            HttpSession session = request.getSession(true);  
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            session.setAttribute("role", role);
            System.out.println("admin");
            response.sendRedirect("adminhome.jsp");
           }
        else
           {
               if(role.equalsIgnoreCase("faculty")&& role.equals(role))
               {
                   HttpSession session = request.getSession(true);
                   session.setAttribute("username", username);
                   session.setAttribute("password", password);
                   session.setAttribute("role",role);
                   System.out.println("Faculty");
                   response.sendRedirect("homefaculty.jsp");
                   
               }
               else
               {
                   if(role.equalsIgnoreCase("hod") && role.equals(role))
                   {
                   HttpSession session = request.getSession(true);
                   session.setAttribute("username", username);
                   session.setAttribute("password", password);
                   session.setAttribute("role",role);
                   System.out.println("Hod");
                   response.sendRedirect("homeHod.jsp"); 
                   }   
               
           
            else
           {
            response.sendRedirect("adminlogin.html");
          }
       }
    }
  } 
 }
}