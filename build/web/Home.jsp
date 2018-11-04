<%-- 
    Document   : Home
    Created on : 19 Jul, 2018, 9:46:37 AM
    Author     : harshita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        
          <jsp:useBean id="l" class="p1.Student"></jsp:useBean>
        <jsp:setProperty name="l" property="*"></jsp:setProperty>
       
        <%-- name:<jsp:getProperty name="l" property="name"></jsp:getProperty>
        roll no:<jsp:getProperty name="l" property="roll"></jsp:getProperty>
        age:<jsp:getProperty name="l" property="age"></jsp:getProperty>
address:<jsp:getProperty name="l" property="address"></jsp:getProperty>  --%>
        
        
        <%
            int p=l.insert("student");
            
            %>
        <%=p%>
    </body>
</html>
