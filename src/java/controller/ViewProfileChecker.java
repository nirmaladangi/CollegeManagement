
package controller;

import dto.EmpDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ViewProfileAuthenticator;

/**
 *
 * @author Nirmala
 */
public class ViewProfileChecker extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      response.sendRedirect("adminlogin.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
     String id =request.getParameter("id"); 
     String role=request.getParameter("role");
     
        EmpDTO emp= new EmpDTO();
        emp.setEmpId(id);
        emp.setEmpRole(role);
     
      ViewProfileAuthenticator authenticator = new ViewProfileAuthenticator();
        boolean view = authenticator.isView(emp);
        System.out.println(role);
      
        if(view)
       {
          HttpSession session =request.getSession(true);
          session.setAttribute("id",id);
          session.setAttribute("role",role);
          response.sendRedirect("profileupdate.jsp");
       }
       else
       {
           response.sendRedirect("viewprofile.html");
       }
        

    }
   
}
