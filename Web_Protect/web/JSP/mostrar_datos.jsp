<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Documento sin t&iacute;tulo</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="Servlet_servicios"><p align="center"> DATOS DEL CLIENTE </p>
  <table width="268" border="1" align="center">
<%
      String id_cliente=(String) request.getParameter("id_cliente");
      String nombres=(String) request.getParameter("nombres");
      String direccion=(String) request.getParameter("direccion");
      String telefijo=(String) request.getParameter("telefijo");
      String celular=(String) request.getParameter("celular");
      %>
    <tr>
      <td width="98">Id Cliente </td>
      <td width="86"><label><%= id_cliente%></label></td>
    </tr>
    <tr>
      <td>Nombres</td>
      <td><label><%= nombres%></label></td>
    </tr>
    <tr>
      <td>Direccion</td>
      <td><label><%= direccion%></label></td>
    </tr>
    <tr>
      <td>Tele Fijo </td>
      <td><label><%= telefijo%></label></td>
    </tr>
    <tr>
      <td>Celular</td>
      <td><label><%= celular%></label></td>
    </tr>
  </table>
  <p align="center">
    <label></label>
    <a href="/Web_Proyecto/index.jsp">Regresar</a></p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>
</body>
</html>
