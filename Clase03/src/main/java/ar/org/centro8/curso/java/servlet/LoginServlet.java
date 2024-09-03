package ar.org.centro8.curso.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //TODO hacer formulario Login
        //TODO usar método post

        //http://localhost:8080/login?user=root&pass=1234

        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            out.println("<h3>No se permite ingreso por GET!</h3>");
        } catch (Exception e) {
            System.out.println("**************************************");
            System.out.println(e);
            System.out.println("**************************************");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out=response.getWriter()) {
            String user=request.getParameter("user");
            String pass=request.getParameter("pass");
            if( user!=null && pass!=null &&
                user.equals("root") && pass.equals("1234")){
                out.println("<h2>Bienvenido Usuario!</h2>");
            }else{
                out.println("<h2>Credenciales invalidas!</h2>");
            }
        } catch (Exception e) {
            System.out.println("**************************************");
            System.out.println(e);
            System.out.println("**************************************");
        }
    }
    

    
}
