/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelos.*;
import java.util.Arrays;

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
            Jugador jugador;
            Casino objC;

            //Capturamos los datos del Jugador
            String nombre = request.getParameter("txtNombre1");
            double valorApostar = Double.parseDouble(request.getParameter("txtVr1"));
            int numApostado = Integer.parseInt(request.getParameter("txtNum1"));
            jugador = new Jugador(nombre, valorApostar, numApostado);

            if (jugador.validarVrApostar() && jugador.validarNumero()) {
                objC = new Casino();

                if (objC.numeroJugadores() < 4 && objC.validarDatos()) {
                    objC.insertarJugador(jugador);
                    out.println("<h1>Se Creo el Jugador N° " + (objC.numeroJugadores() + 1) + "</h1>");
                    out.println("<br>");

                    int i = 0;

                    while (i < objC.vJugadores().length) {
                        out.println("<h1>Jugador N° " + (i + 1) + "</h2>");
                        out.println("<br>");
                        out.println("<p>Nombre: "
                                + objC.vJugadores()[i].getNombre() + "</p>");
                        out.println("<br>");
                        out.println("<p>Valor Apostado: "
                                + objC.vJugadores()[i].getNumeroApostar() + "</p>");
                        out.println("<br>");
                        out.println("<p>Numero Apostado: "
                                + objC.vJugadores()[i].getNumeroApostar() + "</p>");
                        i++;
                    }

                    out.println("<a href=Juego.jsp>Ingresar Otro Jugador</a>");

                } else {
                    out.println("<h2>Jugadores ya Fueron ingresados correctamente!!!</h2>");
                    out.println("<br>");
                    out.println("<a href=Juego.jsp>Ingresar Otro Jugador</a>");
                }

            } else {
                out.println("<h1>Ingrese por Favor lo siguiente</h1>");
                out.println("<p>el Valor Apostar mayor o igual 10.000$ y numero apostar entre 0 y 10</p>");
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletJugadores</title>");
            out.println("</head>");
            out.println("<body>");

        } catch (NumberFormatException ex) {
            out.println("<h1>Error: " + ex.toString() + "</h1>");
        } catch (Exception ex) {
            out.println(ex.toString());
        }
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
