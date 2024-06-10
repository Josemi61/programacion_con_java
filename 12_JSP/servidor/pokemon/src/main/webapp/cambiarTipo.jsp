<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>PROYECTO PROVINCIAS</title>
  </head>
  <body>
    <h1>Pokemon</h1>
    <% 
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery("SELECT * FROM tipo;");
    %>
    <form action="hacerUpdate.jsp" method="post">
      <label for="poke">Selecciona un tipo nuevo para el pokemon:</label>
      <select id="poke" name="poke">
      <%
        while(resultado.next()) {
          out.println("<option value=\"" + request.getString("id_tipo") + "\">");
          out.println(resultado.getString("nombre"));
          out.println("</option>");
        }
      %>
      </select>
      <br>
      <button>Cambiar</button>
    </form>

    <% 
      conexion.close();
    %>
  </body>
</html>