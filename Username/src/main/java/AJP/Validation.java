package AJP;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse; 
public class Validation extends GenericServlet 
{ 
public void service(ServletRequest req,ServletResponse res)throws 
ServletException,IOException 
{ 
PrintWriter pw=res.getWriter(); 
String x=req.getParameter("user"); 
String y=req.getParameter("pwd"); 
if(x.equals("admin")&&y.equals("admin")) 
pw.println("<font color='green' size='5'>Welcome to this webpage</font>"); 
else 
pw.println("<font color='red' size='5'>Invalid username or password</font>"); 
pw.close(); 
} 
}

