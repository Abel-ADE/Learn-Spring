<%-- 
    Document   : saludo
    Created on : 26 jun 2024, 16:34:09
    Author     : abel
--%>

<%@page import="com.mycompany.model.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="src/styles.css"/>
    </head>
    <body>
        <h1>Hello World JSP!</h1>

        <h2>Expresiones:</h2>
        <!-- Expresiones Java -->
        <p>Hola, la fecha del sistema es: <%= new java.util.Date()%></p>
        <p>Convirtiendo a mayúsculas: <%= new String("abel").toUpperCase()%></p>
        <!-- Expresión matemática -->
        <p>La suma de 5 y 7 es: <%= 5 + 7%> </p>
        <!-- Expresión booleana -->
        <p>10 es mayor que 100: <%= 10 > 100%></p>

        <h2>Scriptlets:</h2>

        <p>Lista añadida con Java</p>

        <ul>
            <%
                for (int i = 0; i < 10; i++) {
                    out.print("<li>Mensaje " + i + "</li>");
                }
            %>
        </ul>

        <p> El resultado de sumar 7 y 5 es: <%= new Calculadora().metodoSuma(7, 5)%> </p>
        <p> El resultado de restar 7 y 5 es: <%= new Calculadora().metodoResta(7, 5)%> </p>
        <p> El resultado de multiplicar 7 y 5 es: <%= new Calculadora().metodoMultiplica(7, 5)%> </p>
    </body>
</html>
