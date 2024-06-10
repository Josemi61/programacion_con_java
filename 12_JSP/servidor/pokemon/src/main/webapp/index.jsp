<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pokemon</title>
    <meta charset="UTF-8" />
    <!-- Enlaces a Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  </head>
  <body>
    <div class="container">
      <h1>Pokedex</h1>
      <table class='table table-striped'> 
        <thead class='thead-dark'>
        <tr>
          <th>#</th> <th>Nombre del pokemon</th> <th></th> <th></th> <th></th>
        </tr>
        </thead>
        <tbody>
      <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery ("SELECT * FROM pokemon;");
        while (resultado.next()) {
          out.println("<tr><td>" + resultado.getString("numero_pokedex") + "</td> " + "<td>" + resultado.getString("nombre") + "</td>" + "<td></td>" + "<td><img src=\"" + resultado.getString("sprite") + "\"></td><td><form action=\"detalles.jsp\" method=\"post\"><input type=\"hidden\" name=\"numPokedex\" value=\"" + resultado.getString("numero_pokedex") + "\"><button class=\"btn btn-info\">Detalles</button></form></td>");
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

