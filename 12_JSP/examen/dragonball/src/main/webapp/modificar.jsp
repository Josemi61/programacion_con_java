<%@page import="modules.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%
  Connection conexion = Conexion.getConexion("dragonball");
  Statement consulta = conexion.createStatement();
  consulta.execute("UPDATE personaje SET nombre = " + request.getParameter(nombre) + ", energia = " + request.getParameter(energia) +  ", sexo = " + request.getParameter(sexo) + " , imagen = " + request.getParameter(imagen) + " , descripcion = " + request.getParameter(descripcion) + " WHERE id = " + request.getParameter("id")+ ";");

  
  conexion.close();

  response.sendRedirect("http://localhost:8080/dragonball");

%>