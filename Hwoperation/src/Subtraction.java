

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sub")
public class Subtraction extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();	
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		
		String bt=request.getParameter("subtractionn");
		
		
		if(request.getParameter("subtractionn")!=null)
		{
		out.print("The subtraction= "+(num1-num2));
		}
		else
		{
			out.print("Start again");
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
