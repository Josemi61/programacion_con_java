<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>

<% 
  //Conectamos con la BBDD
  Class.forName("com.mysql.jdbc.Driver");
  Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb", "root", "");
  Statement consulta = conexion.createStatement();

  //EL metodo execute devuelve un objeto de la clase ResultSet, por lo que unicamente se utilizara para consultas de tipo select.
  //El metodo execute devuelve TRUE|FALSE, por lo que utilizaremos preferentemente tan solo para las consultas de tipo insert, delete y update.

  consulta.execute("DELETE FROM pokemon_tipo WHERE id_tipo = " + request.getParameter("idtipo") + " AND numero_pokedex = " + request.getParameter("numpo") + ";");
  conexion.close();


  response.sendRedirect("http://localhost:8080/pokemon");

%>