<%-- 
    Document   : registro.jsp
    Created on : 26 jun 2024, 19:44:22
    Author     : abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de usuario:</h1>
        
        <p>Nombre: <%= request.getParameter("name") %></p>
        <p>Apellido: <%= request.getParameter("surname") %></p>
    </body>
</html>
