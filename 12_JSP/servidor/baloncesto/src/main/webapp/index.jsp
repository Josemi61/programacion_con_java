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
    <!-- Enlaces a Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  </head>
  <body>
    <div class="container">
      <h1>Listado de Socios</h1>
      <table class='table table-striped'> 
        <thead class='thead-dark'>
        <tr>
          <th>IdSocio</th> <th>Nombre</th> <th>Estatura</th> <th>Edad</th> <th>Localidad</th><th></th><th></th>
        </tr>
        </thead>
        <tbody>
        <tr>
        <form method="post" action="grabaSocio.jsp">
          <td>
          <input type="text" class="form-control" name="numero" id="numero"/></td>
          <td>
          <input type="text" class="form-control" name="nombre" id="nombre"/></td>
          <td>
          <input type="text" class="form-control" name="estatura" id="estatura"/></td>
          <td>
          <input type="text" class="form-control" name="edad" id="edad"/></td>
          <td>
          <input type="text" class="form-control" name="localidad" id="localidad"/></td>
          <td><button type="submit" class="btn btn-primary">Crear</button></td>
          <td></td>
        </tr>
      <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery ("SELECT * FROM socio;");
        while (resultado.next()) {
          out.println("<tr><td>" + resultado.getString("socioID") + "</td> " + "<td>" + resultado.getString("nombre") + "</td>" + "<td>" + resultado.getString("estatura") + "</td>" + "<td>" + resultado.getString("edad") + "</td>" + "<td>" + resultado.getString("localidad") + "</td><td></td><td></td></tr>");
        }
        conexion.close();
      %>
      </tbody>
      </table>
    </div>
    <!-- Enlaces a Bootstrap JS y dependencias -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  </body>
</html>
