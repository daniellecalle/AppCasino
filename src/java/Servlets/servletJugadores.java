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
            Jugador jugador1 = new Jugador();
            Jugador jugador2 = new Jugador();
            Jugador jugador3 = new Jugador();
            Jugador jugador4 = new Jugador();

            //Capturamos los datos del primer Jugador
            jugador1.setNombre(request.getParameter("txtNombre1"));
            jugador1.setValorApostar(Double.parseDouble(request.getParameter("txtVr1")));
            jugador1.setNumeroApostar(Integer.parseInt(request.getParameter("txtNum1")));

            //Capturamos los datos del Segundo jugador
            jugador2.setNombre(request.getParameter("txtNombre2"));
            jugador2.setValorApostar(Double.parseDouble(request.getParameter("txtVr2")));
            jugador2.setNumeroApostar(Integer.parseInt(request.getParameter("txtNum2")));

            //Capturamos los datos del Tercer Jugador
            jugador3.setNombre(request.getParameter("txtNombre3"));
            jugador3.setValorApostar(Double.parseDouble(request.getParameter("txtVr3")));
            jugador3.setNumeroApostar(Integer.parseInt(request.getParameter("txtNum3")));

            //Capturamos los datos del Cuarto Jugador
            jugador4.setNombre(request.getParameter("txtNombre4"));
            jugador4.setValorApostar(Double.parseDouble(request.getParameter("txtVr4")));
            jugador4.setNumeroApostar(Integer.parseInt(request.getParameter("txtNum4")));

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
