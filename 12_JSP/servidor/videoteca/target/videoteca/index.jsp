<%-- index.jsp --%>
<%-- @author Christian Rodríguez Lara --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <title>Banca Turing </title>
    <meta charset="utf-8" />

    <style>
      p { text-align: justify ; }
    </style>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

  </head>
  <body>
    <%-- Establecemos conexión con la BBDD haciendo una seleccion de todos los valores de pelicula ordenandolos segun el año --%>
    <%  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoteca", "root", "");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery("SELECT * FROM pelicula ORDER BY DESC;");
    %>
    <form action="añadir.jsp" method="post">
      <button>Añadir pelicula</button>
    </form>
    <table>
      <thead>
      <tr>
        <th>Titulo</th>
        <th>Director</th>
        <th>Año</th>
        <th></th>
        <th></th>
        <th></th>
      </tr>
      </thead>
      <tbody>
        <% while (resultado.next()) {%>
        <tr>
          <td><%= resultado.getString("titulo") %></td>
          <td><%= resultado.getString("director") %></td>
          <td><%= resultado.getString("anio") %></td>
          <td>
            <form action="info.jsp" method="post">
              <input type="hidden" name="idPel" value="<%= resultado.getString("idPel")%>"/>
              <button>Info</button>
            </form>
          </td>
          <td>
            <form action="editar.jsp" method="post">
              <input type="hidden" name="idPel" value="<%= resultado.getString("idPel")%>"/>
              <button>Editar</button>
            </form>
          </td>
          <td>
            <form action="borrar.jsp" method="post">
              <input type="hidden" name="idPel" value="<%= resultado.getString("idPel")%>"/>
              <button>Borrar</button>
            </form>
          </td>
        <% } %>
        </tr>
      </tbody>
    </table>
    <%-- Creamos una tabla donde se mostrarán los datos de las diferentes peliculas --%>
    <h1>Videoteca</h1>
  
  </body>
</html>