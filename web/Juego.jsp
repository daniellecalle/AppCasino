<%-- 
    Document   : Juego
    Created on : 9/04/2018, 09:13:07 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="#">App Casino</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">Inicio <span class="sr-only">(current)</span></a>
                        </li>                  
                    </ul>
                </div>
            </nav>
            <br><br>   
            <form action="servletJugadores" method="post">
                <div class="card text-dark bg-light  mb-3" style="max-width: 18rem;">
                    <h5 class="card-header bg-primary">DATOS DE JUGADOR</h5>
                    <div class="card-body">
                        <img class="card-img-top" src="images/img5.png" alt="Card image cap">
                        <h5 class="card-title">Datos del Primer Jugador</h5>
                        <p class="card-text">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Ingrese Nombre</label>
                            <input type="text" name="txtNombre1"  class="form-control"  
                                   placeholder="Ingrese Nombre" required>                                    
                        </div>                               
                        <div class="form-group">
                            <label for="exampleInputEmail1">Ingrese Valor aportar: </label>
                            <input type="number" name="txtVr1"  class="form-control"  
                                   placeholder="Ingrese Valor apostar" required>                                    
                        </div>                               
                        <div class="form-group">
                            <label for="exampleInputEmail1">Ingrese Numero que va aportar</label>
                            <input type="number" name="txtNum1"  class="form-control"   
                                   placeholder="Ingrese Numero apostar" required>                                    
                        </div>

                        </p>
                        <center><input type="submit" name="btnEnviar" value="Iniciar" 
                                       class="btn btn-primary"></center>
                    </div>
                </div>


            </form>






        </div>
    </body>
</html>
