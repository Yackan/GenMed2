<%-- 
    Document   : usuarios
    Created on : 11-may-2020, 19:40:51
    Author     : Sulay Cupitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
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
    <div class="col-sm-4">
        <li class="nav-item">
    <ul class="nav nav-pills flex-column">
  <button class="w3-bar-item w3-button" onclick="openCity('London')">quienes somos</button>   </ul>
  <ul class="nav nav-pills flex-column">
  <button class="w3-bar-item w3-button" onclick="openCity('Paris')">iniciar sesion</button> </ul>
  <ul class="nav nav-pills flex-column">
  <button class="w3-bar-item w3-button" onclick="openCity('Tokyo')">contacto</button></ul>

    </li>

        
      
      <ul class="nav nav-pills flex-column">
     
          
        
      </ul>
      <hr class="d-sm-none">
    </div>
    <div class="col-sm-8">
      
<div id="London" class="w3-container city">
<h2>GenMed</h2>
      <h5>Mision</h5>
      <div class="fakeimg">Fake Image</div>
      <p>Some text..</p>
      <p>  La misión de la empresa es comprometerse en ayudar a los pacientes a mejorar su calidad de
vida. Por tal motivo las aplicaciones le permitirán registrarse y recordarle el momento
indicado para tomarse su medicamento.</p>
      <br>
      <h5>Vision</h5>
      <div class="fakeimg">Fake Image</div>
      <p>Some text..</p>
      <p>a empresa es una organización sin ánimo de lucro por su finalidad es convertirse en un
soporte de ayuda a los pacientes mediante una herramienta tecnológica que les permita ser
constantes a la hora de consumir sus medicamentos</p>

<h5>servicios ofrecidos</h5>
      <div class="fakeimg">Fake Image</div>
      <p>Some text..</p>
      <p>los servicios establecidos por la empresa por el momento es generar una aplicación de
recordatorio para los pacientes quienes sus médicos tratantes han establecido determinando
tratamientos con medicamentos específicos si horarios fijos para el paciente
</p>
    </div>


<div id="Paris" class="w3-container city" style="display:none">
<h1>Login</h1>
        <form action="selver" method="post">
            Usuarios:  
            <input name="usuarios" type="text"><br>
            Password:  
            <input name="pasworld" type="password"><br> 
            <input type="submit" name="btn1" value="INGRESAR">
        </form>
</div>

    
<div id="Tokyo" class="w3-container city" style="display:none">
 <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
    <h2 class="w3-wide w3-center">CONTACT</h2>
      <div class="w3-row w3-padding-32">
    
        
        
        
         <div class="w3-col m6 w3-large w3-margin-bottom">
        <i class="fa fa-map-marker" style="width:30px"></i> Chicago, US<br>
        <i class="fa fa-phone" style="width:30px"></i> Phone: +00 151515<br>
        <i class="fa fa-envelope" style="width:30px"> </i> Email: mail@mail.com<br>
      </div>
        
         <div class="w3-col m6">
      <form action="/action_page.php" target="_blank">
          <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
            <div class="w3-half">
              <input class="w3-input w3-border" type="text" placeholder="Name" required name="Name">
            </div>
            <div class="w3-half">
              <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
            </div>
          </div>
          <input class="w3-input w3-border" type="text" placeholder="Message" required name="Message">
          <button class="w3-button w3-black w3-section w3-right" type="submit">SEND</button>
        </form></div>




 </div> </div></div>
    </div> 
</div>

  
<script>
function openCity(cityName) {
  var i;
  var x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  document.getElementById(cityName).style.display = "block";  
}
</script>

   
    

 


<div class="jumbotron text-center" style="margin-bottom:0">
  <p>Footer</p>
</div>

</body>
</html>
