<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./assets/css/Estilos.css">
    <title>Cartas Aleatorias</title>
</head>
<body>

<h1>Cartas Aleatorias</h1>
<br>

<%
    final String EXTENSION = ".png";
    // Crear una lista con los números de las cartas del 1 al 40
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    for (int i = 1; i <= 40; i++) {
        numeros.add(i);
    }

    // Barajar la lista para obtener un orden aleatorio
    Collections.shuffle(numeros);

    // Tomar los primeros cuatro números de la lista barajada
    ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(numeros.subList(0, 4));
%>

<div>
    <%
        // Mostrar las cuatro cartas aleatorias
        for (int numero : numerosAleatorios) {
            out.println("<img src=\"./assets/img/img/" + numero + EXTENSION + "\"  />");
        }
    %>
</div>

<br><br>

<form action="index.jsp" method="get">
    <button type="submit">Barajar</button>
</form>

</body>
</html>
