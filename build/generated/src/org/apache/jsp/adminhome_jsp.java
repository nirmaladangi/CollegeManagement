package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>adminhome page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("         a:link {\n");
      out.write("                color: red;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("         /* visited link */\n");
      out.write("        a:visited {\n");
      out.write("                   color: green;\n");
      out.write("                   }\n");
      out.write("\n");
      out.write("          /* mouse over link */\n");
      out.write("          a:hover {\n");
      out.write("                color: hotpink;\n");
      out.write("                 }\n");
      out.write("\n");
      out.write("         /* selected link */\n");
      out.write("          a:active {\n");
      out.write("                  color: blue;\n");
      out.write("                   }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body bgcolor=\"cyan\">\n");
      out.write("        <h1 align=\"center\">Admin login successful...</h1> \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h1 style=\"\">STUDENT</h1>\n");
      out.write("            <a href=\"registration.html\" >Add Student</a><br>\n");
      out.write("            <a href=\"removeuser.html\" >Remove Student</a><br>\n");
      out.write("            <a href=\"updateprofile.html\" >Update Student</a><br>\n");
      out.write("            <a href=\"viewprofile.html\" >View individual Student</a><br>\n");
      out.write("            <a href=\"viewprofileall.html\" >View All Student</a><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h1 style=\"\">FACULTY</h1>\n");
      out.write("            <a href=\"registration.html\" >Add Faculty</a><br>\n");
      out.write("            <a href=\"removeuser.html\" >Remove Faculty</a><br>\n");
      out.write("            <a href=\"updateprofile.html\" >Update Faculty</a><br>\n");
      out.write("            <a href=\"viewprofile.html\" >View individual Faculty</a><br>\n");
      out.write("            <a href=\"viewprofileall.html\" >View All Faculty</a><br>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("       <div align=\"center\">\n");
      out.write("            <h1 style=\"\">add HOD</h1>\n");
      out.write("            <a href=\"registration.html\" >Add HOD</a><br>\n");
      out.write("            <a href=\"removeuser.html\" >Remove HOD </a><br>\n");
      out.write("            <a href=\"updateprofile.html\" >Update HOD</a><br>\n");
      out.write("            <a href=\"viewprofile.html\" >View individual HOD</a><br>\n");
      out.write("            <a href=\"viewprofileall.html\" >View All HOD</a><br>\n");
      out.write("        </div>\n");
      out.write("            \n");
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
