<%-- index.jsp (proyecto mediatresnotas) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Media Tres Notas</title>
</head>
<body>
<h1>Media de tres notas</h1>
<form method="get" action="media.jsp">
Introduzca el nombre de una fruta:
<input type="text" name="primera">
<input type="text" name="segunda">
<input type="text" name="tercera">
<input type="submit" value="OK">
</form>
</body>
</html>