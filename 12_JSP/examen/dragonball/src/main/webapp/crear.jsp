<%@page import="modules.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%
  Connection conexion = Conexion.getConexion("dragonball");
  Statement consulta = conexion.createStatement();
  consulta.execute( "INSERT INTO personaje (nombre, energia, sexo, imagen, descripcion) VALUES ('" + request.getParameter("nombre") + "', '" + request.getParameter("energia") + "', '" + request.getParameter("sexo") + "', '" + request.getParameter("imagen") + "', '" + request.getParameter("descripcion") + "');");
  
  conexion.close();

  response.sendRedirect("http://localhost:8080/dragonball");

%>