<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="Servlet_Servicios">
 
  
  <h1 align="center">REGISTRE DATOS DEL CLIENTE</h1>
   <table width="313" border="1" align="center">
    <tr>
      <td width="153"><strong>Id Cliente</strong></td>
      <td width="144"><label for="Id_Cliente"></label>
      <input type="text" name="Id_Cliente" id="Id_Cliente" /></td>
    </tr>
    <tr>
      <td><strong>Nombres</strong></td>
      <td><label for="Nombres"></label>
      <input type="text" name="Nombres" id="Nombres" /></td>
    </tr>
    <tr>
      <td><strong>Direccion</strong></td>
      <td><label for="Direccion"></label>
      <input type="text" name="Direccion" id="Direccion" /></td>
    </tr>
    <tr>
      <td><strong>Telefono Fijo</strong></td>
      <td><label for="Telefono_Fijo"></label>
      <input type="text" name="Telefono_Fijo" id="Telefono_Fijo" /></td>
    </tr>
    <tr>
      <td height="27"><strong>Celular</strong></td>
      <td><label for="Celular"></label>
      <input type="text" name="Celular" id="Celular" /></td>
    </tr>
  </table>
  <p align="center">
    <input type="submit" name="Enviar" id="Enviar" value="Enviar" />
    <input type="submit" name="Actualizar" id="Actualizar" value="Actualizar" />
  </p>
</form>
</body>
</html>