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
            <br>
            <form method="post" action="servletJugadores">
                <div class="row">
                    <div class="col-sm">
                        <div class="card text-dark bg-light  mb-8" style="max-width: 24rem;">
                            <h5 class="card-header card text-white bg-dark ">DATOS DE JUGADOR #1</h5>
                            <div class="card-body">
                                <img class="card-img-top" src="images/img10.png" alt="Card image cap">
                                <!--<h5 class="card-title">Datos del Primer Jugador</h5>-->
                                <p class="card-text">

                                <div class="form-group">
                                    <% String jugador1 = request.getParameter("txtNombre1"); %>
                                    <b><label for="exampleInputEmail1"><%=jugador1%></label></b>
                                    <input type="hidden" name="txtNombre1"  class="form-control"
                                           value="<%=jugador1%>">                                    
                                </div>                               
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Saldo($): </label></b>
                                    <input type="number" name="txtSaldo1"  class="form-control"  
                                           value="10000" readonly="readonly">                                    
                                </div>                               
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Numero a Aportar</label></b>
                                    <input type="number" name="txtNumero1"  class="form-control"   
                                           placeholder="Ingrese Numero apostar" >                                    
                                </div>
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Valor a Apostar: </label></b>
                                    <input type="number" name="txtValor1"  class="form-control">                                                                               
                                </div>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm">
                        <div class="card text-dark bg-light  mb-8" style="max-width: 24rem;">
                            <h5 class="card-header card text-white bg-dark ">DATOS DE JUGADOR #2</h5>
                            <div class="card-body">
                                <img class="card-img-top" src="images/img10.png" alt="Card image cap">
                                <!--<h5 class="card-title">Datos del Primer Jugador</h5>-->
                                <p class="card-text">

                                <div class="form-group">
                                    <% String jugador2 = request.getParameter("txtNombre2"); %>
                                    <b><label for="exampleInputEmail1"><%=jugador2%></label></b>
                                    <input type="hidden" name="txtNombre2"  class="form-control"
                                           value="<%=jugador2%>">                                    
                                </div>                               
                                <div class="form-group">
                                    
                                    <b><label for="exampleInputEmail1">Saldo($): </label></b>
                                    <input type="number" name="txtSaldo2"  class="form-control"  
                                           value="10000" readonly="readonly">                                    
                                </div>                               
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Numero a Apostar: </label></b>
                                    <input type="number" name="txtNumero2"  class="form-control"   
                                           placeholder="Ingrese Numero apostar" >                                    
                                </div>
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Valor a Apostar: </label></b>
                                    <input type="number" name="txtValor2"  class="form-control">                                                                               
                                </div>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm">
                        <div class="card text-dark bg-light  mb-8" style="max-width: 24rem;">
                            <h5 class="card-header card text-white bg-dark ">DATOS DE JUGADOR #3</h5>
                            <div class="card-body">
                                <img class="card-img-top" src="images/img10.png" alt="Card image cap">
                                <!--<h5 class="card-title">Datos del Primer Jugador</h5>-->
                                <p class="card-text">

                                <div class="form-group">
                                    <% String jugador3 = request.getParameter("txtNombre3"); %>
                                    <b><label for="exampleInputEmail1"><%=jugador3 %></label></b>
                                    <input type="hidden" name="txtNombre3"  class="form-control"  
                                           value="<%=jugador3 %>" >                                    
                                </div>                              
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Saldo($): </label></b>
                                    <input type="number" name="txtSaldo3"  class="form-control"  
                                           value="10000" readonly="readonly">                                    
                                </div> 
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Numero a Apostar: </label></b>
                                    <input type="number" name="txtNumero3"  class="form-control">                                                                               
                                </div>
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Valor a Aportar</label></b>
                                    <input type="number" name="txtValor3"  class="form-control">   
                                                                             
                                </div>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm">
                        <div class="card text-dark bg-light  mb-8" style="max-width: 24rem;">
                            <h5 class="card-header card text-white bg-dark ">DATOS DE JUGADOR #4</h5>
                            <div class="card-body">
                                <img class="card-img-top" src="images/img10.png" alt="Card image cap">
                                <!--<h5 class="card-title">Datos del Primer Jugador</h5>-->
                                <p class="card-text">

                                <div class="form-group">
                                    <% String jugador4 = request.getParameter("txtNombre4"); %>
                                    <b><label for="exampleInputEmail1"><%=jugador4 %></label></b>
                                    <input type="hidden" name="txtNombre4"  class="form-control"  
                                           value="<%=jugador4 %>"  >                                    
                                </div>                               
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Saldo($): </label></b>
                                    <input type="number" name="txtSaldo4"  class="form-control"  
                                           value="10000" readonly="readonly">                                    
                                </div>                               
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Numero a Aportar</label></b>
                                    <input type="number" name="txtNumero4"  class="form-control"   
                                           placeholder="Ingrese Numero apostar" >                                    
                                </div>
                                <div class="form-group">
                                    <b><label for="exampleInputEmail1">Valor a Apostar: </label></b>
                                    <input type="number" name="txtValor4"  class="form-control">                                                                               
                                </div>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <br>
                <center>
                    <input type="submit" name="btnJugar" value="Jugar" class="btn btn-primary">
                </center>
            </form>
            <br><br>
            <div class="card bg-light">
                <div class="card-body">
                    <footer >
                        <p>Desarrollado Por: Daniel Posada calle & Mateo Hincapie</p>

                        <address>
                            Contactenos: <a href="mailto:danielposada235616@correo.itm.edu.co">danielposada235616@correo.itm.edu.co</a><br>                        
                        </address> 

                    </footer>
                </div>
                <div class="card-footer text-white bg-dark">
                    <h6>Todos Los Derechos Reservados &copy; 2018</h6>
                </div>
            </div>



        </div>
    </body>
</html>
