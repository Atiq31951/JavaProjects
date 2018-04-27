package Servlets.BFSServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

@WebServlet(name = "BFSPageShow")
public class BFSPageShow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("Yes Ashce");
        response.setContentType("text/html;charset=UTF-8");
        String nodes=request.getParameter("nodes");
        String edge=request.getParameter("edges");
        PrintWriter out = response.getWriter();
        int N=parseInt(nodes);
        if(nodes.length() <1)
        {
            response.sendRedirect("BFS.jsp");
        }
        try
        {
            out.println("<html><head><title>BFS Result</title><body>");
            out.println("<form action=\"BFSPageShow\" method=\"post\" name=\"Onee\">");

            for(int i=1;i<=N;i++)
            {
                out.print("Node "+i+"Has ");
                String namee = "Name"+i;
                out.println("<input name= namee type=\"text\" value=namee><br>");
                System.out.println("Ne = "+namee);
            }
            out.println("</body></html>");
        }
        finally {
            out.close();
        }
    }
}
