import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
 
import java.io.IOException;


import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;

 
public class WebGame extends AbstractHandler{
	
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);        
        response.getWriter().println(HTMLPage.getPage());
    }
 
    public static void main(String[] args) throws Exception{    	
        Server server = new Server(8080);
        server.setHandler(new WebGame());
        server.join();
    }
}
class HTMLPage {
    private static final int refreshTime = 1000;

    private static String pagePart0 = "<html>";
   
    
    public static String getPage(){
        return pagePart0;    }
}