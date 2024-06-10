<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>PROYECTO PROVINCIAS</title>
  </head>
  <body>
    <%
      if(request.getParameterMap().size() == 1) {
    %>
    <form action="insertarProvincias" method="post">
    <input type="hidden" name="ccaa" value= "<%= request.getParameter("ccaa") %>"/>
    <label for="prov">Introduce provincia:</label>
    <input type="text" id="prov" name="prov" autofocus required/>
    <button>Guardar</button>
    </form>
    <%
      } else {
        request.setCharacterEncoding("UTF-8");
        String nombreProvincia = request.getParameter("prov");
        String codCCAA = request.getParameter("ccaa");
        String sql = "INSERT INTO provincia(codCCAA, nomProv) VALUES (" + codCCAA + " , '" + nombreProvincia + "');";
        Connection conexion = Conexion.getConexion("ccaa");
        Statement consulta = conexion.createStatement();
        consulta.execute(sql);
        conexion.close();
        response.sendRedirect("http://localhost:8080/provincias");
      }
      
    %>
  </body>
</html>