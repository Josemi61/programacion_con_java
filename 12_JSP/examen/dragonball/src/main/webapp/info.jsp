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
    .div{
      display: flex;
    }
    </style>
    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </head>
  <body>
  <% 
  Connection conexion = Conexion.getConexion("dragonball");
  Statement consulta = conexion.createStatement();
  ResultSet resultado = consulta.executeQuery("SELECT * FROM personaje P JOIN afiliacion A ON (P.idAfiliacion=A.id) JOIN raza R ON (P.idRaza=R.id) WHERE P.id = " + request.getParameter("id") +";");
  resultado.next();
  %>

  <h1>Dragonball</h1>
  
  <div class="div">
    <div>
      <img src="<%=resultado.getString("imagen") %>">
    </div>
    <div>
      <h1><%=resultado.getString("nombre")%></h1>
      <p><b>Energia:  </b><%=resultado.getString("energia")%> KI</p>
      <p><b>Sexo:  </b><%=resultado.getString("sexo")%></p>
      <p><b>Raza:  </b><%=resultado.getString("raza")%></p>
      <p><b>Afiliacion:  </b><%=resultado.getString("afiliacion")%></p>
      <p><b>Descripción:</b></p>
      <p><%=resultado.getString("descripcion")%></p>
    </div>
  </div>
  <a href="http://localhost:8080/dragonball">Volver atras</a>

  <% 
  conexion.close();
  %>
  <body>
</html>