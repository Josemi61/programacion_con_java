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
      ResultSet resultado = consulta.executeQuery("SELECT * FROM pelicula WHERE idPel = " + request.getParameter("idPel") + ";");
      ResultSet join = consulta.executeQuery("SELECT * FROM genero G " +
                                            "JOIN pelicula_genero PG " +
                                            "ON (G.idGen = PG.idGen) " +
                                            "WHERE PG.idPel = " + request.getParameter("idPel") + " ;");
    %>
    <div>
    <h1>Videoteca</h1>
      <div>
        <img src="<%= resultado.getString("poster") %>">
      </div>
      <div></div>
    </div>

  </body>
</html>