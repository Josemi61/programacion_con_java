<%@page import="modules.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%
  Connection conexion = Conexion.getConexion("dragonball");
  Statement consulta = conexion.createStatement();
  consulta.execute("DELETE FROM personaje WHERE id = " + request.getParameter("id") + ";");
  
  conexion.close();

  response.sendRedirect("http://localhost:8080/dragonball");

%>