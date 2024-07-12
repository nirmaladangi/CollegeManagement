

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile page</title>
    </head>
    <body bgcolor="pink"> 
        <a href="logout.jsp">sign out</a>
        <% 
         String id=(String)session.getAttribute("id");
         String emp =(String)session.getAttribute("role");
         if(id==null || id.trim().equals("") && emp==null || emp.equals(""))
         {
           response.sendRedirect("viewProfile.html");  
         }
        %>
        <h1>Hello user</h1>
        <h2>login successful</h2>
        <form action="ViewProfileChecker"  Method="Post">
         <%
           Statement  st=DBConnector.getStatement();
           String query="select * from emp where empid='"+id+"'";
           
           System.out.println("Query = "+query);
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
           {
           %>   
           <table>
               <tr>
                   <td> <strong>User Name:</strong> </td>
                   <td><input type="text" name="username" value =<%=rs.getString(1)%>></td>
               </tr>   
                <tr>
                   <td> <strong>User_Id:</strong> </td>
                   <td><input type="text" name="id" value =<%=rs.getString(2)%>></td>
               </tr>   
               <tr>
                   <td> <strong>User Password:</strong> </td>
                   <td><input type="password" name="password" value =<%=rs.getString(3)%>></td>
               </tr>  
                <tr>
                   <td> <strong>User joining_date:</strong> </td>
                   <td><input type="date" name="joining_date" value =<%=rs.getString(4)%>></td>
               </tr>  
                
               <tr>
                   <td> <strong>User Salary:</strong> </td>
                   <td><input type="text" name="salary" value =<%=rs.getString(5)%>></td>
               </tr>  
               <tr>
                   <td> <strong>User Department:</strong> </td>
                   <td><input type="text" name="department" value =<%=rs.getString(6)%>></td>
               </tr>  
               <tr>
                   <td> <strong>User Role:</strong> </td>
                   <td><input type="text" name="role" value =<%=rs.getString(7)%>></td>
               </tr>  
               <tr>
                   <td> <strong>User City:</strong> </td>
                   <td><input type="text" name="city" value =<%=rs.getString(8)%>></td>
               </tr>  
            
             <tr>
                   <td> <strong>User Contact_no:</strong> </td>
                   <td><input type="text" name="contact_no" value =<%=rs.getString(9)%>></td>
               </tr>  
            
         </table>
            <% 
             }
             %>
               
        </form>
        
        
    </body>
</html>
