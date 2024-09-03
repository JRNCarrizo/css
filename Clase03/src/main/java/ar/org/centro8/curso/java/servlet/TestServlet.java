package ar.org.centro8.curso.java.servlet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            out.println("<h1>Hola Mundo Servlet!!</h1>");       //Esto se renderiza
            System.out.println("Aprendiendo Servlet");          //Esto se imprime en consola
        
            //Párametros de entrada
            //http://localhost:8080/testServlet?nombre=Carlos
            String nombre=request.getParameter("nombre");
            if(nombre!=null && !nombre.isEmpty()){
                out.println("<h2>hola "+nombre+"</h2>");
            }
            
        
        } catch (Exception e) {
            System.out.println("**************************************");
            System.out.println(e);
            System.out.println("**************************************");
        }
    }

   
    
}
