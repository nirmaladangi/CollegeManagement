<%-- 
    Document   : profileupdate
    Created on : 4 Sep, 2023, 10:20:43 PM
    Author     : Nirmala
--%>

<%@page import="db.DBConnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="dto.EmpDTO"%>
<%@page import="dao.EmpDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile update Page</title>
    </head>
    <body bgcolor="hotpink">
         <a href="logout.jsp">sign out</a>
        <% 
         String id=(String)session.getAttribute("id");
         String role =(String)session.getAttribute("role");
         if(id == null || id.trim().equals("") && role == null || role.equals(""))
         {
           response.sendRedirect("viewprofile.html");  
         }
        %>
        <h1>Hello user</h1>
        
    <%
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
 %>
 
  <%
           Statement  st = DBConnector.getStatement();
           String query = "select * from emp where empid ='"+id+"'";
           
           System.out.println("Query = "+query);
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
           {
           %> 
          <form action="EditChecker" Method="Post">
         <table>
               <tr>
                   <td> <strong>User Name:</strong> </td>
                   <td><input type="text" name="username" value =<%=rs.getString(1)%>></td>
               </tr>   
                <tr>
                   <td> <strong>User id:</strong> </td>
                   <td><input type="text" name="id"  value =<%=rs.getString(2)%>></td>
               </tr>   
               <tr>
                   <td> <strong>User Password:</strong> </td>
                   <td><input type="password" name="password" value =<%=rs.getString(3)%>></td>
               </tr>  
                <tr>
                    <td> <label for="datepicker"><strong>User joining_date:</strong></label> </td>
                   <td><input type="date" name="date" id="datepicker" value =<%=rs.getString(4)%>></td>
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
             
               <tr>
                   <td><input type="submit" value="update"></td>
               </tr>
         </table>
            <% 
             }
            %>
               
          </form>
    </body>
</html>
