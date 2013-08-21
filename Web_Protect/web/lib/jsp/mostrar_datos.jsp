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
                String id_cliente=(String) request.getParameter("id_cliente");
                String nombres=(String) request.getParameter("nombres");
                String direccion=(String) request.getParameter("direccion");
                String telefijo=(String) request.getParameter("telefijo");
                String celular=(String) request.getParameter("celular");
            %>
            <span class="full"><b>Id Cliente:</b></span>
            <span class="full"><%= id_cliente%></span>
            <span class="full"><b>Nombres:</b></span>
            <span class="full"><%= nombres%></span>
            <span class="full"><b>Dirección:</b></span>
            <span class="full"><%= direccion%></span>
            <span class="full"><b>Télefono:</b></span>
            <span class="full"><%= telefijo%></label></td>
            <span class="full"><b>Celular:</b></span>
            <span class="full"><%= celular%></span>
            <a href="/webApplication/index.jsp">Regresar</a>
        </div>
    </body>
</html>
