package Servlets.LoginLogoutServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try
        {
            out.println("<html>\n<head>\n<title>Login</title>\n<head>\n");
            out.println("<body>Register Post</body></html>");
        }
        finally
        {
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try
        {
            out.println("<html>\n<head>\n<title>Login</title>\n<head>\n");
            out.println("<body>Regiter Get</body></html>");
        }
        finally
        {
            out.close();
        }

    }
}
