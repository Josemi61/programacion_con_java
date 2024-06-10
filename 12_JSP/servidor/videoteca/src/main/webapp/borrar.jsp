
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>

<%
Class.forName("com.mysql.jdbc.Driver");
Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoteca", "root", "");
Statement consulta = conexion.createStatement();
consulta.execute("DELETE FROM pelicula WHERE idPel = " + request.getParameter("idPel") + ";");





conexion.close();
response.sendRedirect("http://localhost:8080/videoteca");
%>