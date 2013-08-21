<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Datos</title>
        <link rel="stylesheet" href="/webApplication/lib/css/style.css">
    </head>
    <body>
        <div class="container">
            <h1>Datos del cliente</h1>
            <%
                String id=(String) request.getParameter("id");
                String names=(String) request.getParameter("names");
                String address=(String) request.getParameter("address");
                String phone=(String) request.getParameter("phone");
                String cellphone=(String) request.getParameter("cellphone");
            %>
            <span class="full"><b>Id Cliente:</b></span>
            <span class="full"><%= id %></span>
            <span class="full"><b>Nombres:</b></span>
            <span class="full"><%= names %></span>
            <span class="full"><b>Dirección:</b></span>
            <span class="full"><%= address %></span>
            <span class="full"><b>Télefono:</b></span>
            <span class="full"><%= phone %></label></td>
            <span class="full"><b>Celular:</b></span>
            <span class="full"><%= cellphone %></span>
            <a href="/webApplication/index.jsp">Regresar</a>
        </div>
    </body>
</html>
