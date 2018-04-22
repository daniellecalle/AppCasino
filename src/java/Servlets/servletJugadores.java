/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Jugador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daniel
 */
@WebServlet(name = "servletJugadores", urlPatterns = {"/servletJugadores"})
public class servletJugadores extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {

            String nom1, nom2, nom3, nom4;
            double saldo1, saldo2, saldo3, saldo4, vrapuesta1, vrapuesta2, vrapuesta3, vrapuesta4;
            int num1, num2, num3, num4;

            Jugador objJ = new Jugador();
                       
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletJugadores</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
            out.println(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<center><h1>JUEGO DE RULETA<h1></center>");

            objJ.Random();
            objJ.getRandom();
            
            //capturamos los nombres de los jugadores
            objJ.setNom1(request.getParameter("txtNombre1"));
            objJ.setNom2(request.getParameter("txtNombre2"));
            objJ.setNom3(request.getParameter("txtNombre3"));
            objJ.setNom4(request.getParameter("txtNombre4"));
            
            //Capturamos la Informacion de Valores apostados
            vrapuesta1 = Double.parseDouble(request.getParameter("txtValor1"));
            vrapuesta2 = Double.parseDouble(request.getParameter("txtValor2"));
            vrapuesta3 = Double.parseDouble(request.getParameter("txtValor3"));
            vrapuesta4 = Double.parseDouble(request.getParameter("txtValor4"));

            //capturamos la numeros a apsotados
            num1 = Integer.parseInt(request.getParameter("txtNumero1"));
            num2 = Integer.parseInt(request.getParameter("txtNumero2"));
            num3 = Integer.parseInt(request.getParameter("txtNumero3"));
            num4 = Integer.parseInt(request.getParameter("txtNumero4"));

            //capturamos la ifnromacion de saldos
            saldo1 = Double.parseDouble(request.getParameter("txtSaldo1"));
            saldo2 = Double.parseDouble(request.getParameter("txtSaldo2"));
            saldo3 = Double.parseDouble(request.getParameter("txtSaldo3"));
            saldo4 = Double.parseDouble(request.getParameter("txtSaldo4"));

            //1
            if (saldo1 == 0) {
                objJ.setNumApostado1(0);
                objJ.setVrApostado1(0);
                out.println("<h1>Jugador Eliminado Porque su Saldo actal es de cero(0)</h1>");
            } else {
                
                if (vrapuesta1 <= saldo1) {
                    objJ.setVrApostado1(vrapuesta1);
                    objJ.setSaldo1(saldo1);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Valor Apostado Supera el Saldo Actual</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                    objJ.setSaldo1(saldo1);
                }

                if (num1 >= 0 && num1 <= 10) {
                    objJ.setNumApostado1(num1);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Numero a apostar debe estar en el Rango del 0 al 10.</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                }

                vrapuesta1 = objJ.ganador1();

                if (vrapuesta1 > saldo1) {
                    out.println("<div class=\"card\">");
                    out.println("<div class=\"card-header\">");
                    out.println("</div>");
                    out.println("<div class=\"card-body\">");
                    out.println("<h2 class=\"card-title\">El Jugador: " + objJ.getNom1()
                            + "Fue Ganador con el Numero: " + objJ.getRandom() + "</h2>");
                    out.println("<br>");
                    out.println("<h1>Nuevo Saldo: </h1>");
                    out.println("<p>El Jugador 1: " + objJ.getNom1()
                            + "Su Nuevo Saldo es: " + (vrapuesta1 + saldo1) + "</p>");
                    out.println("<p>El Jugador 2: " + objJ.getNom2()
                            + "Su Nuevo Saldo es: " + (saldo2 - vrapuesta2) + "</p>");
                    out.println("<p>El Jugador 3: " + objJ.getNom3()
                            + "Su Nuevo Saldo es: " + (saldo3 - vrapuesta3) + "</p>");
                    out.println("<p>El Jugador 4: " + objJ.getNom4()
                            + "Su Nuevo Saldo es: " + (saldo4 - vrapuesta4) + "</p>");

                    out.println("<br>");

                    out.println("<a href=\"index.jsp\" class=\"btn btn-successs\">Jugar de Nuevo</a>");
                    out.println("</div>");
                    out.println("</div>");
                }
            }

            //2
            if (saldo2 == 0) {
                objJ.setNumApostado2(0);
                objJ.setVrApostado2(0);
            } else {
                
                if (vrapuesta2 <= saldo2) {
                    objJ.setVrApostado2(vrapuesta2);
                    objJ.setSaldo2(saldo2);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Valor Apostado Supera el Saldo Actual</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                    objJ.setSaldo2(saldo2);
                }

                if (num2 >= 0 && num2 <= 10) {
                    objJ.setNumApostado2(num2);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Numero a apostar debe estar en el Rango del 0 al 10.</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                }

                vrapuesta2 = objJ.ganador2();

                if (vrapuesta2 > saldo2) {
                    out.println("<div class=\"card\">");
                    out.println("<div class=\"card-header\">");
                    out.println("</div>");
                    out.println("<div class=\"card-body\">");
                    out.println("<h2 class=\"card-title\">El Jugador: " + objJ.getNom2()
                            + "Fue Ganador con el Numero: " + objJ.getRandom() + "</h2>");
                    out.println("<br>");
                    out.println("<h1>Nuevo Saldo: </h1>");
                    out.println("<p>El Jugador 1: " + objJ.getNom1()
                            + "Su Nuevo Saldo es: " + (saldo1 - vrapuesta1) + "</p>");
                    out.println("<p>El Jugador 2: " + objJ.getNom2()
                            + "Su Nuevo Saldo es: " + (vrapuesta2 + saldo2) + "</p>");
                    out.println("<p>El Jugador 3: " + objJ.getNom3()
                            + "Su Nuevo Saldo es: " + (saldo3 - vrapuesta3) + "</p>");
                    out.println("<p>El Jugador 4: " + objJ.getNom4()
                            + "Su Nuevo Saldo es: " + (saldo4 - vrapuesta4) + "</p>");

                    out.println("<br>");

                    out.println("<a href=\"index.jsp\" class=\"btn btn-successs\">Jugar de Nuevo</a>");
                    out.println("</div>");
                    out.println("</div>");
                    
                }
            }

            //3
            if (saldo3 == 0) {
                objJ.setNumApostado3(0);
                objJ.setVrApostado3(0);
            } else {
                
                if (vrapuesta3 <= saldo3) {
                    objJ.setVrApostado3(vrapuesta3);
                    objJ.setSaldo3(saldo3);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Valor Apostado Supera el Saldo Actual</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                    objJ.setSaldo3(saldo3);
                }

                if (num3 >= 0 && num3 <= 10) {
                    objJ.setNumApostado3(num3);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Numero a apostar debe estar en el Rango del 0 al 10.</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-info\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                }

                vrapuesta3 = objJ.ganador3();

                if (vrapuesta3 > saldo3) {
                    out.println("<div class=\"card\">");
                    out.println("<div class=\"card-header\">");
                    out.println("</div>");
                    out.println("<div class=\"card-body\">");
                    out.println("<h2 class=\"card-title\">El Jugador: " + objJ.getNom3()
                            + " Fue Ganador con el Numero: " + objJ.getRandom() + "</h2>");
                    out.println("<br>");
                    out.println("<h1>Nuevo Saldo: </h1>");
                    out.println("<p>El Jugador 1: " + objJ.getNom1()
                            + " Su Nuevo Saldo es: " + (saldo1 - vrapuesta1) + "</p>");
                    out.println("<p>El Jugador 2: " + objJ.getNom2()
                            + " Su Nuevo Saldo es: " + (saldo2 - vrapuesta2) + "</p>");
                    out.println("<p>El Jugador 3: " + objJ.getNom3()
                            + " Su Nuevo Saldo es: " + (vrapuesta3 + saldo3) + "</p>");
                    out.println("<p>El Jugador 4: " + objJ.getNom4()
                            + " Su Nuevo Saldo es: " + (saldo4 - vrapuesta4) + "</p>");

                    out.println("<br>");

                    out.println("<a href=\"index.jsp\" class=\"btn btn-success\">Jugar de Nuevo</a>");
                    out.println("</div>");
                    out.println("</div>");
                }
            }

            //4
            if (saldo4 == 0) {
                objJ.setNumApostado4(0);
                objJ.setVrApostado4(0);
            } else {

                if (vrapuesta4 <= saldo4) {
                    objJ.setVrApostado4(vrapuesta4);
                    objJ.setSaldo4(saldo4);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Valor Apostado Supera el Saldo Actual</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-success\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                    objJ.setSaldo4(saldo4);
                }

                if (num4 >= 0 && num4 <= 10) {
                    objJ.setNumApostado4(num4);
                } else {
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<div class=\"card mb-12\" style=\"max-width: 26rem;\">");
                    out.println("<div class=\"card-header\">");
                    out.println("<b>Atencion Señor Usuario!!!</b>");
                    out.println("</div>");
                    out.println(" <img class=\"card-img-top\" src=\"images/img11.png\" alt=\"Card image cap\">");
                    out.println("<div class=\"card-body\">");
                    out.println("<h5 class=\"card-title\"><b>Ingrese por Favor lo siguiente...</b></h5>");
                    out.println("<p class=\"card-text\">El Numero a apostar debe estar en el Rango del 0 al 10.</p>");
                    out.println("<a href=\"Juego.jsp\" class=\"btn btn-success\" class=\"card-link\">Atras</a> | ");
                    out.println("<a href=\"index.jsp\" class=\"btn btn-success\" class=\"card-link\">Volver Al inicio</a>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</center>");
                }

                vrapuesta4 = objJ.ganador4();

                if (vrapuesta4 > saldo4) {
                    out.println("<div class=\"card\">");
                    out.println("<div class=\"card-header\">");
                    out.println("</div>");
                    out.println("<div class=\"card-body\">");
                    out.println("<h2 class=\"card-title\">El Jugador: " + objJ.getNom4()
                            + " Fue Ganador con el Numero: " + objJ.getRandom() + "</h2>");
                    out.println("<br>");
                    out.println("<h1>Nuevo Saldo: </h1>");
                    out.println("<p>El Jugador 1: " + objJ.getNom1()
                            + " Su Nuevo Saldo es: " + (saldo1 - vrapuesta1) + "</p>");
                    out.println("<p>El Jugador 2: " + objJ.getNom2()
                            + " Su Nuevo Saldo es: " + (saldo2 - vrapuesta2) + "</p>");
                    out.println("<p>El Jugador 3: " + objJ.getNom3()
                            + " Su Nuevo Saldo es: " + (saldo3 - vrapuesta3) + "</p>");
                    out.println("<p>El Jugador 4: " + objJ.getNom4()
                            + " Su Nuevo Saldo es: " + (saldo4 - vrapuesta4) + "</p>");

                    out.println("<br>");

                    out.println("<a href=\"index.jsp\" class=\"btn btn-success\">Jugar de Nuevo</a>");
                    out.println("</div>");
                    out.println("</div>");
                }
            }

            if (vrapuesta1 > objJ.ganador1() && vrapuesta2 > objJ.ganador2()
                    && vrapuesta3 > objJ.ganador3() && vrapuesta4 > objJ.ganador4()) {
                out.println("<div class=\"card\">");
                out.println("<div class=\"card-header\">");
                out.println("</div>");
                out.println("<div class=\"card-body\">");
                out.println("<h1>No Hubo Ningun Ganador. El Numero fue: " + objJ.getRandom() + "</h1>");
                out.println("<br>");
                out.println("<h1>Nuevo Saldo: </h1>");
                out.println("<p>El Jugador 1: " + objJ.getNom1()
                        + " Su Nuevo Saldo es: " + (saldo1 - vrapuesta1) + "</p>");
                out.println("<p>El Jugador 2: " + objJ.getNom2()
                        + " Su Nuevo Saldo es: " + (saldo2 - vrapuesta2) + "</p>");
                out.println("<p>El Jugador 3: " + objJ.getNom3()
                        + " Su Nuevo Saldo es: " + (saldo3 - vrapuesta3) + "</p>");
                out.println("<p>El Jugador 4: " + objJ.getNom4()
                        + " Su Nuevo Saldo es: " + (saldo4 - vrapuesta4) + "</p>");

                out.println("<br>");

                out.println("<a href=\"index.jsp\" class=\"btn btn-success\">Jugar de Nuevo</a>");
                out.println("</div>");
                out.println("</div>");
            }

        } catch (NumberFormatException ex) {
            out.println("<div class=\"card border-danger mb-3\" style=\"max-width: 18rem;\">");
            out.println("<div class=\"card-header\">Header</div>");
            out.println("<div class=\"card-body text-danger\">");
            out.println("<h5 class=\"card-title\">Danger card title</h5>");
            out.println("<p class=\"card-text\">" + ex.toString() + "</p>");
            out.println("</div>");
            out.println("</div>");
        } catch (ArithmeticException artEx) {
            out.println("<div class=\"card border-danger mb-3\" style=\"max-width: 18rem;\">");
            out.println("<div class=\"card-header\">Header</div>");
            out.println("<div class=\"card-body text-danger\">");
            out.println("<h5 class=\"card-title\">Danger card title</h5>");
            out.println("<p class=\"card-text\">" + artEx.toString() + "</p>");
            out.println("</div>");
            out.println("</div>");
        } catch (Exception ex) {
            out.println("<div class=\"card border-danger mb-3\" style=\"max-width: 18rem;\">");
            out.println("<div class=\"card-header\">Header</div>");
            out.println("<div class=\"card-body text-danger\">");
            out.println("<h5 class=\"card-title\">Danger card title</h5>");
            out.println("<p class=\"card-text\">" + ex.toString() + "</p>");
            out.println("</div>");
            out.println("</div>");
        }

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
