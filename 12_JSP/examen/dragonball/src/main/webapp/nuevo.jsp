<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="modules.Conexion" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%-- TU NOMBRE AQUÍ --%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>Dragonball Z</title>
	<meta charset="utf-8" />
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">

    <link href="./assets/css/style.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
            crossorigin="anonymous"></script>
</head>
<body>
    <%
    Connection conexion = Conexion.getConexion("dragonball");
    Statement consulta = conexion.createStatement();
    ResultSet resultado = consulta.executeQuery("SELECT * FROM raza;");

    %>
 
    <div class="container">

        <h1 class="mt-4">Dragonball Z</h1>

        <form action="crear.jsp" method="post">

            <%-- NOMBRE, RAZA Y AFILIACIÓN --%>
            <div class="row mt-4">
                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="nombre">Nombre:</label>
                    <input class="form-control" id="nombre" name="nombre" type="text" autofocus />
                </div>

                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="raza">Raza:</label>

                    <select class="form-control" id="raza" name="raza">
                    <% while (resultado.next()) { %>
                        <option><%=resultado.getString("raza")%></option>
                    <% } %>
                    </select>
                </div>

                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="afiliacion">Afiliación:</label>
                    <select class="form-control" id="afiliacion" name="afiliacion">
                    <% 
                    resultado = consulta.executeQuery("SELECT * FROM afiliacion;");
                    while (resultado.next()) { %>
                        <option><%=resultado.getString("afiliacion")%></option>
                    <% } %>
                    </select>
                </div>
            </div>

            <%-- ENERGÍA, SEXO E IMAGEN --%>
            <div class="row mt-2">
                <div class="col-sm-4">
                    <label class="form-label fw-bold" for="energia">Energía:</label>
                    <input class="form-control" id="energia"  name="energia" type="text" />
                </div>

                <div class="col-sm-2">
                    <label class="form-label fw-bold" for="sexo">Sexo:</label>
                    <input class="form-control" id="sexo"  name="sexo" type="text" />
                </div>

                <div class="col-sm-6">
                    <label class="form-label fw-bold" for="imagen">URL imagen:</label>
                    <input class="form-control" id="imagen" name="imagen" type="text" />
                </div>
            </div>

            <%-- DESCRIPCIÓN --%>
            <div class="row mt-2">
                <div class="col-sm-12">
                    <label class="form-label fw-bold" for="descripcion">Descripción:</label>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-12">
                    <textarea class="form-control" id="descripcion" name="descripcion" rows="5"></textarea>
                </div>
            </div>
            
            <%-- BOTONERA --%>
            <div class="row mt-4">
                <div class="col-sm-12 text-end">
                    <button class="btn btn-dark" href="http://localhost:8080/dragonball/crear.jsp">Guardar</button>
                    <a class="btn btn-danger" href="http://localhost:8080/dragonball">Cancelar</a>
                </div>
            </div>
        </form>

    </div>
<%
conexion.close();
%>
</body>
</html>