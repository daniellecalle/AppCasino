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
            Jugador jugador = new Jugador();
            Casino objC;

            int pos = 0;

            //Capturamos los datos del Jugador
            jugador.setNombre(request.getParameter("txtNombre1"));
            jugador.setValorApostar(Double.parseDouble(request.getParameter("txtVr1")));
            jugador.setNumeroApostar(Integer.parseInt(request.getParameter("txtNum1")));

            if (jugador.validarVrApostar() && jugador.validarNumero()) {
                objC = new Casino();

                if (objC.numeroJugadores() < 4 || objC.validarDatos() == true) {
                    out.println("<h2>Jugadores ya Fueron ingresados correctamente!!!</h2>");
                    out.println("<br>");
                    out.println("<a href=Juego.jsp>Ingresar Otro Jugador</a>");
                } else {
                    objC.insertarJugador(jugador);

                    for (int i = 0; i < objC.vJugadores().length; i++) {
                        pos = i;
                    }

                    out.println("<h1>Se Creo el Jugador N° " + pos + "</h1>");
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
