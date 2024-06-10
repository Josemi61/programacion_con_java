<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado Socios</title>
    <meta charset="UTF-8" />
  </head>
  <body>
    <h1>Listado de Socios</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery ("SELECT * FROM socio;");
      while (resultado.next()) {
        out.println(resultado.getString("socioID") + " " + resultado.getString("nombre") + "<br>");
      }
      conexion.close();
    %>
  </body>
</html>