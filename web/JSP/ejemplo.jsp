<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario</title>
</head>
<body>
<div align="center">
<table>
<tr>
<td>Registrar Usuario</td>
<td>Registrar Paciente</td>
</tr>
<tr>
<td>
<form action="ServletRegistro" method="get">
<table>
<tr>
<td>Numero de identificacion,   ejemplo: Cedula, pasaporte etc..</td>
<td><input type="text" size="24" name="ID"></td>
</tr>
    
<tr>
<td>Nombre:</td>
<td><input type="text" size="24" name="nombre"></td>
</tr>
<tr>
<td>Apellido:</td>
<td><input type="text" size="24" name="apellido"></td>
</tr>
<tr>
<div class="w3-container">
          <h5 class="w3-opacity"><b>London Business School</b></h5>
          <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>2013 - 2015</h6>
          <p>Master Degree</p>
          <hr>
        </div>
</tr>
<tr>
<td>Edad</td>
<td><input type="text" size="24" name="edad"></td>
</tr>
<tr>
<td>Alergias</td>
<td><input type="text" size="24" name="Alergia"></td>
</tr>
<tr>
    <td>usted sufre de </td>
          <td>  <select name="usted sufre de ">
               <option value="1">Niguna</option>

                <option value="2">fractura de manos y/o brazos</option>
                <option value="3">parkinson</option>
                <option value="4">enfermedad senil</option>
                <option value="5">autismo</option>
                <option value="6">alzahimer</option>
                <option value="7">artorisis y/o distrofia muscular</option>
         
            </select><br> </td></tr> 
      <tr>      
            <td> TIPO DE SANGRE:de </td>
            
           <td>   <select name="tipo de sangre">
                <option value="1">O+</option>
                <option value="2">O-</option>
                <option value="3">A+</option>
                <option value="4">A-</option>
                <option value="5">B+</option>
                <option value="6">B-</option>
                <option value="7">AB+</option>
                <option value="8">AB-</option>
            </select>
            <br> </td></tr> 

<tr>
<td>Correo:</td>
<td><input type="text" size="24" name="correo"></td>
</tr>
<tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Registrar"></td>
</tr>


</table>
</form>
</td>




<td>
<form action="ServletRegistro" method="post">
<table>
<tr>
<td>Usuario:</td>
<td><input type="text" size="20" name="usuario"></td>
</tr>
<tr>
<td>Contraseña:</td>
<td><input type="password" size="20" name="clave"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Registrar"></td>
</tr>
</table>
</form>
</td>
</tr>
</table>
</div>
</body>
</html>