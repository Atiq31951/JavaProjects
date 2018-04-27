package Servlets.SortingServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Sort")
public class Sort extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int [] arr=new int[1000];

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s=request.getParameter("values");

        int len=s.length();

        if(len<=0)
            response.sendRedirect("Algos/Sorting/Sort.jsp");

        String s1;
        int cnt=0;

        try
        {
            cnt=0;
            int number=0,sum=0;
            for(int i=0;i<len;i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                    sum=sum*10+(s.charAt(i)-'0');
                else
                {
                    arr[cnt]=sum;
                    System.out.println("Sum = "+sum);
                    sum=0;
                    cnt++;
                }
            }
            if(sum>=0)
                arr[cnt++]=sum;

            Arrays.sort(arr,0,5);

            out.println("<html>\n<head>\n<title>Sort Result</title>\n<head>\n");
            out.println("<body>The Sorted Values are ");

            for(int i=0;i<cnt;i++)
                out.print(arr[i]+" ");

            out.println("</body></html>");
        }
        finally
        {
            out.close();
        }
    }
}
