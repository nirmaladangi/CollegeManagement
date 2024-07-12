package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;
import dto.EmpDTO;
import dao.EmpDAO;

public final class profileupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>profile update Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"hotpink\">\n");
      out.write("         <a href=\"logout.jsp\">sign out</a>\n");
      out.write("        ");
 
         String id=(String)session.getAttribute("id");
         String role =(String)session.getAttribute("role");
         if(id == null || id.trim().equals("") && role == null || role.equals(""))
         {
           response.sendRedirect("viewprofile.html");  
         }
        
      out.write("\n");
      out.write("        <h1>Hello user</h1>\n");
      out.write("        \n");
      out.write("    ");

        EmpDAO e1 = new EmpDAO();
        EmpDTO e2= e1.getempdata(id);
        String empid =e2.getEmpId();
        String empname=e2.getEmpName();
        String emppassword=e2.getEmpPassword();
        String empdate=e2.getEmpDate();
        String empsalary=e2.getEmpSalary();
        String empdepartment=e2.getEmpDepartment();
        String emprole =e2.getEmpRole();
        String empcity =e2.getEmpCity();
        String empcontact_no=e2.getEmpContact_no();
 
      out.write("\n");
      out.write(" \n");
      out.write("  ");

           Statement  st = DBConnector.getStatement();
           String query = "select * from emp where empid ='"+id+"'";
           
           System.out.println("Query = "+query);
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
           {
           
      out.write(" \n");
      out.write("          <form action=\"EditChecker\" Method=\"Post\">\n");
      out.write("         <table>\n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Name:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"username\" value =");
      out.print(rs.getString(1));
      out.write("></td>\n");
      out.write("               </tr>   \n");
      out.write("                <tr>\n");
      out.write("                   <td> <strong>User id:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"id\"  value =");
      out.print(rs.getString(2));
      out.write("></td>\n");
      out.write("               </tr>   \n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Password:</strong> </td>\n");
      out.write("                   <td><input type=\"password\" name=\"password\" value =");
      out.print(rs.getString(3));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("                <tr>\n");
      out.write("                    <td> <label for=\"datepicker\"><strong>User joining_date:</strong></label> </td>\n");
      out.write("                   <td><input type=\"date\" name=\"date\" id=\"datepicker\" value =");
      out.print(rs.getString(4));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("                \n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Salary:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"salary\" value =");
      out.print(rs.getString(5));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Department:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"department\" value =");
      out.print(rs.getString(6));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Role:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"role\" value =");
      out.print(rs.getString(7));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User City:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"city\" value =");
      out.print(rs.getString(8));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                   <td> <strong>User Contact_no:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"contact_no\" value =");
      out.print(rs.getString(9));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("             \n");
      out.write("               <tr>\n");
      out.write("                   <td><input type=\"submit\" value=\"update\"></td>\n");
      out.write("               </tr>\n");
      out.write("         </table>\n");
      out.write("            ");
 
             }
            
      out.write("\n");
      out.write("               \n");
      out.write("          </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
