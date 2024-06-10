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
      <h1>Pokemon</h1>
      
      <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM pokemon WHERE numero_pokedex = " + request.getParameter("numPokedex") + " ;");
        resultado.next();
        out.println("<h2>" + resultado.getString("nombre") + "</h2>");
        out.println("<img src=\"" + resultado.getString("sprite") + "\">");
        out.println("<ul><li>Altura: " + resultado.getString("altura") + "</li><li>Peso: " + resultado.getString("peso") + "</li></ul>");
      %>

      <%
        resultado = consulta.executeQuery ("SELECT t.descripcion AS descripcion, t.nombre AS tipo_pokemon, t.id_tipo AS id, p.numero_pokedex AS numpo " +
                                            "FROM pokemon p " +
                                            "JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex " +
                                            "JOIN tipo t ON pt.id_tipo = t.id_tipo " +
                                            "WHERE p.numero_pokedex = " + request.getParameter("numPokedex") + ";");
        
      %>
        <h2>Tipo del pokemon</h2>
        <table class='table table-striped'> 
        <thead class='thead-dark'>
        <tr>
          <th>Tipo</th> <th>Descripcion</th> <th></th> <th></th>
        </tr>
        </thead>
        <tbody>
          <% 
          while (resultado.next()) {
          %>
          <tr>
            <td><%= resultado.getString("tipo_pokemon")%></td>
            <td><%= resultado.getString("descripcion")%></td>
            <td><form action="cambiarTipo.jsp" method="post">
                  <input type="hidden" name="idtipo" value=<%= "\"" + resultado.getString("id") + "\""%> > 
                  <input type="hidden" name="numpo" value=<%= "\"" + resultado.getString("numpo") + "\""%> >
                  <button class="btn btn-info\">Editar</button>
                </form>
            </td>
            <td><form action="borrarTipo.jsp" method="post">
                  <input type="hidden" name="idtipo" value=<%= "\"" + resultado.getString("id") + "\""%> >
                  <input type="hidden" name="numpo" value=<%= "\"" + resultado.getString("numpo") + "\""%> >
                  <button class="btn btn-info\">Borrar</button>
                </form>
            </td>
          </tr>
          <%
          }
          %>


        </tbody>

      <%
        conexion.close();
      %>

    </div>
    <!-- Enlaces a Bootstrap JS y dependencias -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  </body>
</html>

