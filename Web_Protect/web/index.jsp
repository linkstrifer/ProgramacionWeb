<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inicio</title>
        <link rel="stylesheet" href="/webApplication/lib/css/style.css">
        <script src="/webApplication/validar.js"></script>
    </head>
    <body>
        <div class="container">
            <form id="form1" name="form1" method="post" action="Servlet_Servicios">
                <h2 align="center capitalize-f">registrar</h2>
                <label class="full">
                    <span class="capitalize-f">id cliente</span>
                    <input type="text" name="id" id="id" />
                </label>
                <label class="full">
                    <span class="capitalize-f">nombres</span>
                    <input type="text" name="names" id="names" />
                </label>
                <label class="full">
                    <span class="capitalize-f">direccion</span>
                    <input type="text" name="address" id="address" />
                </label>
                <label class="full">
                    <span class="capitalize-f">telefono</span>
                    <input type="text" name="phone" id="phone" />
                </label>
                <label class="full">
                    <span class="capitalize-f">celular</span>
                    <input type="text" name="cellphone" id="cellphone" />
                </label>
                <input type="submit" name="send" id="send" value="Enviar" />
                <input type="submit" name="refresh" id="refresh" value="Actualizar" />
            </form>
        </div>
    </body>
</html>