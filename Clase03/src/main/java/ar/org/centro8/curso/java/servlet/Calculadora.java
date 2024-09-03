package ar.org.centro8.curso.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class Calculadora extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        try (PrintWriter out=response.getWriter()) {
            double nro1=Double.parseDouble(request.getParameter("nro1"));
            double nro2=Double.parseDouble(request.getParameter("nro2"));
            String operacion=request.getParameter("operacion");
            switch (operacion) {
                case "suma":    out.println(nro1+nro2);             break;
                case "resta":   out.println(nro1-nro2);             break;
                case "multi":   out.println(nro1*nro2);             break;
                case "divi":    out.println(nro1/nro2);             break;
                default:        out.println("error operación");     break;
            }
        } catch (Exception e) {
            System.out.println("**************************************");
            System.out.println(e);
            System.out.println("**************************************");
        }
    }
    
}
