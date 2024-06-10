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
    <h1>Videoteca</h1>
    <h3>Añadir pelicula</h3>
    <%-- Establecemos conexión con la BBDD haciendo una seleccion de todos los valores de pelicula ordenandolos segun el año --%>
    <%  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoteca", "root", "");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery("SELECT * FROM pelicula WHERE idPel = " + request.getParameter("idPel") + ";");
      resultado.next();
    %>
    <form action="cambiarPeli.jsp" method="post">
      <input type="hidden" name="idPel" value="<%= resultado.getString("idPel") %>"/>
      <div>

      <label for="titulo">Título: </label>
      <input id="titulo" type="text" name="titulo" value="<%= resultado.getString("titulo") %>" />
      </div>
      <div>
      <label for="director">Director: </label>
      <input id="director" type="text" name="director" value="<%= resultado.getString("director") %>" />
      </div>
      <div>

      <label for="duracion">Duración: </label>
      <input id="duracion" type="text" name="duracion" value="<%= resultado.getString("duracion") %>" />
      </div>
      <div>

      <label for="anio">Año de Estreno: </label>
      <input id="anio" type="text" name="anio" value="<%= resultado.getString("anio") %>" />
      </div>
      <div>

      <label for="poster">URL imagen: </label>
      <input id="poster" type="text" name="poster" value="<%= resultado.getString("poster") %>" />
      </div>
      <div>

      <label for="argumento">Argumento: (300 caracteres máximo)</label>
      <textarea id="argumento" name="argumento"><%= resultado.getString("argumento") %></textarea>
      </div>
      <button>Modificar película</button>
    </form>
    <form action="index.jsp" method="post">
    <button>Cancelar</button>
    </form>
    
  <%
  conexion.close(); 
  %>
  
  </body>
</html>