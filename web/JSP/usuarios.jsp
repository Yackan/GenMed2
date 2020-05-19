<%-- 
    Document   : usuarios
    Created on : 11-may-2020, 19:40:51
    Author     : Sulay Cupitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  </style>
</head>
    <body>
        
<div class="jumbotron text-center">
  <header class="w3-display-container w3-content w3-wide" style="max-width:2500px;" id="home">
  <img class="w3-image" src="https://www.deviantart.com/panther-dyams/art/Mary-842416577" alt="Mary" width="2500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>GenMed</b></span> <span class="w3-hide-small w3-text-light-grey">...</span></h1>
      <p>ayudaremos a recuperar tu vida</p> 
  </div>
</header>
</div>
        
        
 <div class="container" style="margin-top:30px">
  <div class="row">

        
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
<td><input type="text" size="29" name="ID"></td>
</tr>
    
<tr>
<td>Nombre:</td>
<td><input type="text" size="29" name="nombre"></td>
</tr>
<tr>
<td>Apellido:</td>
<td><input type="text" size="29" name="apellido"></td>
</tr>
<tr>
<td>Año de Nacimiento:</td>
<td><input type="text" size="29" name="anio"></td>
</tr>
<tr>
<td>Edad</td>
<td><input type="text" size="29" name="edad"></td>
</tr>
<tr>
<td>Alergias</td>
<td><input type="text" size="29" name="Alergia"></td>
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
            <td> TIPO DE SANGRE: </td>
            
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
<td><input type="text" size="29" name="correo"></td>
</tr>
<tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Cancelar"></td>
<td colspan="2" align="left"><input type="submit" value="Registrar"></td>
</tr>


</table>
</form>
</td>




<td>
<form action="ServletRegistro" method="post">
<table>
<tr>
<td>Usuario:</td>
<td><input type="text" size="29" name="usuario"></td>
</tr>
<tr>
<td>Contraseña:</td>
<td><input type="password" size="29" name="clave"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Cancelar"></td>
<td colspan="2" align="left"><input type="submit" value="Registrar"></td>
</tr>
</table>
</form>
</td>
</tr>
</table>
</div>
</body>
</html>