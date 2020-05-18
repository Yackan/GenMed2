<%-- 
    Document   : usuarios
    Created on : 11-may-2018, 19:40:51
    Author     : Sulay Cupitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="CraerUsuarios" method="post">
             CodEST:
            <input name="CodEST" type="text"><br>
            Nombre:
            <input name="Nombre" type="text"><br>
            Apellido:
            <input name="Apellido" type="text"><br>
            Semestre:
            <select name="Semestre">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select><br>
            Carrera:
            <select name="Carrera">
                <option value="Ingenieria de Sistema">Ingenieria de Sistema</option>
                <option value="Ingenieria Electronica">Ingenieria Electronica</option>
                <option value="Ingenieria Industrial">Ingenieria Industrial</option>
                <option value="Ingenieria Ambiental">Ingenieria Ambiental</option>
            </select><br>
            Usuarios:
            <input name="usuarios" type="text"><br>
            Passworld
            <input name="pasworld" type="password"><br> 
            <input type="submit" name="btn1" value="Crear">
          <div>
      <form  method="post" action="index.jsp">
         <input type="Submit" name="btn4" value="EXIT" >
      </form></div>
        </form>
    </body>
</html>
