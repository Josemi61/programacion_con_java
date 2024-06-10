<%-- fruta.jsp (proyecto PasoDeCadena) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Fruta"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Paso de cadena</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8");
    Fruta fruta = new Fruta(request.getParameter("fruta"));
    %>
    <h4>Me gusta mucho comer <%= fruta.getNombre()%></h4>
    <%= fruta%>
  </body>
</html>