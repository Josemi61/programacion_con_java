<%-- index.jsp --%>
<%-- @author Nombre Apellidos --%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="modules.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <title></title>
    <meta charset="utf-8" />
    <style>
    p { text-align: justify ; }
    </style>
    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </head>
  <body>
  <% 
  Connection conexion = Conexion.getConexion("dragonball");
  Statement consulta = conexion.createStatement();
  ResultSet resultado = consulta.executeQuery("SELECT * FROM personaje P JOIN afiliacion A ON (P.idAfiliacion=A.id) JOIN raza R ON (P.idRaza=R.id) ORDER BY nombre ASC;");
  %>

  <h1>Dragonball</h1>
  <form action="nuevo.jsp" method="post">
    <button>Añadir</button>
  </form>
  <table>
    <thead>
      <tr>
        <th>Nombre</th>
        <th>Raza</th>
        <th>Afiliación</th>
        <th></th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <% while (resultado.next()) { %>
      <tr>
        <td><%= resultado.getString("nombre")%></td>
        <td><%= resultado.getString("raza")%></td>
        <td><%= resultado.getString("afiliacion")%></td>
        <td>
          <form action="info.jsp" method="post">
          <input type="hidden" name="id" value="<%= resultado.getString("id")%>">
          <button>Info</button>
          </form>
        </td>
        <td>
          <form action="editar.jsp" method="post">
          <input type="hidden" name="id" value="<%= resultado.getString("id")%>">
          <button>Editar</button>
          </form>
        </td>
        <td>
          <form action="borrar.jsp" method="post">
          <input type="hidden" name="id" value="<%= resultado.getString("id")%>">
          <button>Borrar</button>
          </form>
        </td>
      </tr>
      <% } %>
      
      
    </tbody>
  </table>
  <% 
  conexion.close();
  %>
  <body>
</html>