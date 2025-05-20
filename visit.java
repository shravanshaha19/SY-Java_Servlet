

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class visit
 */
@WebServlet("/visit")
public class visit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int i=1;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String k=String.valueOf(i);
		 Cookie c = new Cookie("visit",k);
		 response.addCookie(c);
		 int j=Integer.parseInt(c.getValue());
		 if(j==1)
		 {
		 out.println("Welcome");
		 }

		 else
		 {
		 out.println("You visited "+i+" times");
		 }
		 i++; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
