package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>profile page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"logout.jsp\">sign out</a>\n");
      out.write("        ");
 
         String userid=(String)session.getAttribute("userid");
         String emp =(String)session.getAttribute("emp");
         if(userid==null || userid.trim().equals("") && emp==null || emp.equals(""))
         {
           response.sendRedirect("viewProfile.html");  
         }
        
      out.write("\n");
      out.write("        <h1>Hello user</h1>\n");
      out.write("        <h2>login successful</h2>\n");
      out.write("        <form action=\"ProfileChecker.java\"  Method=\"Post\">\n");
      out.write("         ");

           Statement  st=DBConnector.getStatement();
           String query="select * from emp where empid='"+userid+"'";
           
           System.out.println("Query = "+query);
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
           {
           
      out.write("   \n");
      out.write("           <table>\n");
      out.write("               <tr>\n");
      out.write("                   <td> <strong>User Name:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"username\" value =");
      out.print(rs.getString(1));
      out.write("></td>\n");
      out.write("               </tr>   \n");
      out.write("                <tr>\n");
      out.write("                   <td> <strong>User_Id:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"\" value =");
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
      out.write("                   <td> <strong>User joining_date:</strong> </td>\n");
      out.write("                   <td><input type=\"text\" name=\"date\" value =");
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
      out.print(rs.getString(4));
      out.write("></td>\n");
      out.write("               </tr>  \n");
      out.write("            \n");
      out.write("         </table>\n");
      out.write("            ");
 
             }
             
      out.write("\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
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
