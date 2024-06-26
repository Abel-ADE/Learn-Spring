<%-- 
    Document   : objetos
    Created on : 26 jun 2024, 18:58:46
    Author     : abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Objetos predefinidos JSP</h1>
        
        <p>Petición de datos del navegador: <%= request.getHeader("User-Agent") %></p>
        
        <p>Idioma utilizado: <%= request.getLocale() %></p>
        
        <p>Id de la sesión: <%= session.getId()%></p>        
    </body>
</html>
