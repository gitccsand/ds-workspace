package com.ds;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

//import sun.net.www.http.HttpClient;
@WebServlet("/HelloWorld.do")
public class HelloWorld extends HttpServlet{
	
	private static final long serialVersionUID = 217251451801586160L;
	
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws HTTPException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
        
//        response.
        
    }
}
