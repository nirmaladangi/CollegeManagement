<%-- 
    Document   : logout
    Created on : 3 Sep, 2023, 9:47:20 AM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout page</title>
    </head>
    <body>
        <% 
          session.invalidate();
          response.sendRedirect("login.html");
        %>
    </body>
</html>
