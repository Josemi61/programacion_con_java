<%-- @author Sergio Sánchez Martín --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<% 
  //Conectamos con la BBDD
  Connection conexion = Conexion.getConexion("ccaa");
  Statement consulta = conexion.createStatement();
  out.println("BORRANDO PROVINCIA CON CLAVE PRIMARIA codProv = " + request.getParameter("cod"));

  //EL metodo execute devuelve un objeto de la clase ResultSet, por lo que unicamente se utilizara para consultas de tipo select.
  //El metodo execute devuelve TRUE|FALSE, por lo que utilizaremos preferentemente tan solo para las consultas de tipo insert, delete y update.

  consulta.execute("DELETE FROM provincia WHERE codProv = " + request.getParameter("cod") + ";");
  conexion.close();

  //Redirigirnos a alguna pagina JSP
  //Forma 1
  // response.setStatus(response.SC_FOUND);
  // response.setHeader("Location", "http://localhost:8080/provincias");

  //Froma 2, = que la 1 pero simplificada
  response.sendRedirect("http://localhost:8080/provincias");



%>