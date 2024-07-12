
package controller;

import dto.EmpDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RemoveUserAuthenticator;

/**
 *
 * @author Nirmala
 */
public class RemoveUserChecker extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      response.sendRedirect("removeuser.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      String id =request.getParameter("id"); 
     // String role=request.getParameter("role");
     
        EmpDTO emp= new EmpDTO();
        emp.setEmpId(id);
        //emp.setEmpRole(role);
     
      RemoveUserAuthenticator authenticator = new RemoveUserAuthenticator();
        boolean remove = authenticator.isRemove(emp);
       // System.out.println(emp);
      
        if(remove)
       {
          HttpSession session =request.getSession(true);
          session.setAttribute("id",id);
          //session.setAttribute("role",role);
          response.sendRedirect("removeuser.jsp");
       }
       else
       {
           response.sendRedirect("removeuser.html");
       }
        
        
        
        
    }
}
