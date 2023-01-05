
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prof")
public class Profile extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");	
		PrintWriter out=response.getWriter();
	   
	   if (request.getParameter("addition")!=null) 
	   {
		   out.print("<form action='add'>");
		   out.print(" <input type='text' name='number1' placeholder='number1'>");
		   out.print("<input type='text' name='number2' placeholder='number2'>");
		   out.print("<input type='submit' value='add' name='additionn'><br>");
		   out.print("</form>");
       }
	   else if (request.getParameter("subtraction")!= null) 
       {
    	   out.print("<form action='sub'>");
		   out.print(" <input type='text' name='number1' placeholder='number1'>");
		   out.print("<input type='text' name='number2' placeholder='number2'>");
		   out.print("<input type='submit' value='sub' name='subtractionn'><br>");
		   out.print("</form>");
       }
	   else if (request.getParameter("multiplication")!= null) 
       {
    	   out.print("<form action='mul'>");
		   out.print(" <input type='text' name='number1' placeholder='number1'>");
		   out.print("<input type='text' name='number2' placeholder='number2'>");
		   out.print("<input type='submit' value='mul' name='Multiplicationn'><br>");
		   out.print("</form>");
       }
   }
	
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  doGet(request, response);
	}

}
