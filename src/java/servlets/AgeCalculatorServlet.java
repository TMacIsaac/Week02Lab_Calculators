/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 838771
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

    /**
 
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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
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
        String age = request.getParameter("current_age");
        int ageNum;
        
        boolean isText = false;
        
        for(int i = 0; i < age.length(); i++){
            if(Character.isLetter(age.charAt(i))) {
                isText = true;
            }
            } 
        
        
        
        
        if(age == null || age.equals("")){
            request.setAttribute("message", "You must give your current age");
            request.setAttribute("input", age);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        else if(age.equals("0")){
            ageNum = 0;
            request.setAttribute("input", age);
            request.setAttribute("message", "You are not 0 years old");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        if(isText){
            request.setAttribute("message", "You must enter a number, not a word");
            request.setAttribute("input", age);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
         else {
            {
                ageNum= Integer.parseInt(request.getParameter("current_age"));
                request.setAttribute("message", "You will be this old on your next birthday: ");
                request.setAttribute("age", ageNum+1);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
                return;
            }
        }
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
