import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Program1 extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    out.print("WelCome "+n);  
  
    Cookie ck=new Cookie("uname",n);  
    response.addCookie(ck);  
  
    out.print("<form action='servlet2'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}
