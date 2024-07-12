

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>faculty home page</title>
    </head>
    <body>
    
        <a href="logout.jsp">Sign out</a>
        <%
         String username =(String)session.getAttribute("username");
          if(username==null || username.trim().equals(""))
          {
             response.sendRedirect("login.html");
          }
        %>
        <h1>Hello <%=username%>......!</h1>
        <h1>login Successful....</h1>
    </body>
</html>
