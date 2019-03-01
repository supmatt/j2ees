import java.io.IOException;
import java.util.Date;
  
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class HelloServlet extends HttpServlet{
  
    public void doGet(HttpServletRequest request, HttpServletResponse response){
          
        try {
            response.getWriter().println("<h1>Hello Servlet and Tomcat!lala</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
      
}

//second fix tomcat problme, but didnt success, today is so difficult, hope tomorrow will be better.
//FEB 27 renew eclipse can run server, Bravo !!!!