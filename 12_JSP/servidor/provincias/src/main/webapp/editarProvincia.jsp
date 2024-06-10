<%-- @author Christian Rodríguez Lara --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <title>PROYECTO PROVINCIAS</title>
  </head>
  <body>
    <% 
      if(request.getParameterMap().size() == 1){
        
    %>
    <form action="editarProvincia.jsp" method="post">

      <label for="codProv">Código de Provincia: </label>
      <input id="codProv" type="text" size="5" name="codProv" value="<%= request.getParameter("codProv")%>"readonly>
      <br>
      <label for="prov">Introduce un nuevo nombre de Provincia:</label>
      <input id="prov" type="text" size="5" name="prov" autofocus required>
      <button>Modificar</button>
    </form>
    <% 
    }else{
      request.setCharacterEncoding("UTF-8");
      //Preparamos la consulta UPDATE
      String nombreProvincia = request.getParameter("prov");
      //Redactamos consulta SQL
      String sql = "UPDATE provincia SET "
                 + "nomProv='" + nombreProvincia 
                 + "'WHERE codProv = " + Integer.valueOf(request.getParameter("codProv")) + ";";

      //Conectamos con la BBDD
      Connection conexion = Conexion.getConexion("ccaa");
      Statement consulta = conexion.createStatement();

      //Ejecutamos la consulta
      consulta.execute(sql);
      
      response.sendRedirect("http://localhost:8080/provincias");
      //Cerramos la conexión
      conexion.close();
    }
    %>
  </body>
</html>
