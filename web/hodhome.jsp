

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hod home page</title>
    </head>
    <body>
        <a href="logout.jsp">sign out</a>
         <% 
         String username=(String)session.getAttribute("username");
         String password =(String)session.getAttribute("password");
         String role =(String)session.getAttribute("role");
          if(username==null || username.trim().equals("") && password==null || password.equals("") && role==null && role.equals(""))
         {
           response.sendRedirect("adminlogin.html");  
         }
        %>
    </body>
    <form action="updateProfile.html">
        <lable for ="option"><b>Choose For Update:</b></lable>
        <select name ="option" id="option">
            <option value ="student">Update Student:</option>   
        </select>
        <table>
            <tr>
                <td></td>
                <td><input type ="submit" name="login"></td>
            </tr>
        </table>
        </table>
            
    </form>
    <form>
        <form action ="viewProfile.html">
            <lable for ="option"><b>Choose For view Individual Profile:</b></lable>
            <select name ="option" id="option">
                <option value="student">View Student profile</option>
                <option value ="hod">view own profile</option>
                <option value="faculty">view faculty profile</option>
            </select>
             <table>
            <tr>
                <td></td>
                <td><input type ="submit" name="login"></td>
            </tr>
        </table>
            
            
    </form>
</html>
