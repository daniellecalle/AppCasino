<%-- 
    Document   : index
    Created on : 9/04/2018, 07:53:21 PM
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
                        <li class="nav-item active">
                            <a class="nav-link" href="Juego.jsp">Jugar <span class="sr-only">(current)</span></a>
                        </li>   
                    </ul>
                </div>
            </nav>

            <div class="jumbotron">
                <h1 class="display-4">Bienvenido al Juego de Ruleta</h1>
                <p class="lead">Ingrese Los Nombres de los Jugadores Para Empezar a Jugar</p>
                <hr class="my-4">
                <p>
                <center>
                <form method="post" action="Juego.jsp">
                    <div class="row">
                        <div class="col col-4">
                            <b><label>Jugador 1: </label></b>
                        </div>
                        <div class="col col-4">
                            <input type="text" name="txtNombre1" class="form-control"
                                   required="Ingrese Por Favor El nombre Jugador 1"><br>
                        </div>
                        <div class="w-100"></div>

                        <div class="col col-4">
                            <b><label>Jugador 2: </label></b>
                        </div>
                        <div class="col col-4">
                            <input type="text" name="txtNombre2" class="form-control"
                                   required="Ingrese Por Favor El nombre Jugador 2"><br>
                        </div>

                        <div class="w-100"></div>

                        <div class="col col-4">
                            <b><label>Jugador 3: </label></b>
                        </div>
                        <div class="col col-4">
                            <input type="text" name="txtNombre3" class="form-control" required="Ingrese Por Favor El nombre Jugador 3"><br>
                        </div>

                        <div class="w-100"></div>

                        <div class="col col-4">
                            <b><label>Jugador 4: </label></b>
                        </div>
                        <div class="col col-4">
                            <input type="text" name="txtNombre4" class="form-control"
                                   required="Ingrese Por Favor El nombre Jugador 4"><br>
                        </div>
                    </div>
                    <br>
                    <center>
                        <input type="submit" name="Jugar" value="Jugar" class="btn btn-primary">
                    </center>   
                </form>
                </center>
                </p>

            </div>

            <div class="card bg-light">
                <div class="card-body">
                    <footer >
                        <p>Desarrollado Por: Daniel Posada calle & Mateo Hincapie</p>

                        <address>
                            Contactenos: <a href="mailto:danielposada235616@correo.itm.edu.co">danielposada235616@correo.itm.edu.co</a><br>                        
                        </address> 

                    </footer>
                </div>
                <div class="card-footer text-dark ">
                    <h6>Todos Los Derechos Reservados &copy; 2018</h6>
                </div>
            </div>
        </div>




    </body>
</html>
