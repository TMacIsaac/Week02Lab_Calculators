/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 838771
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String var_one = request.getParameter("variable1");
        String var_two = request.getParameter("variable2");
        request.setAttribute("var1", var_one);
        request.setAttribute("var2", var_two);
        
        boolean isText = false;
        
        
        
        if(var_one == null || var_two == null || var_one.equals("") || var_two.equals("")){
            
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
            
        }
        
       for(int i = 0; i < var_one.length(); i++){
            if(Character.isLetter(var_one.charAt(i))){
                isText = true;
            }
        }
        for(int i = 0; i < var_two.length(); i++){
            if(Character.isLetter(var_two.charAt(i))){
                isText = true;
            }
        }
        
        if(isText){
            
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
            
        }
        double num_one = Double.parseDouble(request.getParameter("variable1"));
        double num_two = Double.parseDouble(request.getParameter("variable2"));
        String operation = request.getParameter("operation");
        
        switch (operation) {
            case "+":
                request.setAttribute("result",num_one+num_two);
                break;
            case "-":
                request.setAttribute("result",num_one-num_two);
                break;
            case "*":
                request.setAttribute("result",num_one*num_two);
                break;
            default:
                request.setAttribute("result",num_one/num_two);
                break;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        
    }



}
