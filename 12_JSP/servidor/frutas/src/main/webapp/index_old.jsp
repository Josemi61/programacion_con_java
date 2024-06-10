<%-- index.jsp (proyecto PasoDeCadena) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fruta</title>
<style>
</style>
</head>
<body>
<h1>Pasando una cadena de caracteres</h1>
<form method="get" action="fruta.jsp">
Introduzca el nombre de una fruta:
<select name="fruta" id="fruta">
  <option value="kiwi">Kiwi</option>
  <option value="mango">Mango</option>
  <option value="melon">Melón</option>
  <option value="platano">Platano</option>
  <option value="sandia">Sandia</option>
</select>
<input type="submit" value="OK">
</form>
</body>
</html>