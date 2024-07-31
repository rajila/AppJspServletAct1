<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Personales</title>
    </head>
    <body>
        <h1>Datos Personales</h1>
        <form action="<%=request.getContextPath()%>/myServlet2" method="Post">
          <label for="fname">Nombres:</label><br>
          <input type="text" id="fname" name="fname" placeholder="Ingresar Nombres" value=""><br>
          <label for="lname">Apellidos:</label><br>
          <input type="text" id="lname" name="lname" placeholder="Ingresar Apellidos" value=""><br><br>
          <input class="btn" type="submit" value="Enviar">
        </form>
    </body>
</html>