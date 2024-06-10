<%-- media.jsp (proyecto mediatresnotas) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Media tres notas</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
La media de las notas es: 
<% 
double media = (Double.parseDouble(request.getParameter("primera")) + Double.parseDouble(request.getParameter("segunda")) + Double.parseDouble(request.getParameter("tercera")))/3;
out.print(String.format("%.2f", media))
%>
</body>
</html>