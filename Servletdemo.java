

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servletdemo
 */
@WebServlet("/Servletdemo")
public class Servletdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int sno,s1,s2,s3,total;
		String snm,sclass;
		float per;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		sno=Integer.parseInt(request.getParameter("txtsno"));
		snm=request.getParameter("txtnm");
		sclass=request.getParameter("txtclass");
		s1=Integer.parseInt(request.getParameter("txtsub1"));
		s2=Integer.parseInt(request.getParameter("txtsub2"));
		s3=Integer.parseInt(request.getParameter("txtsub3"));
		total=s1+s2+s3;
		per=(total/3);
		out.println("<html><body>");
		out.println("<h2>Result of student</h2><br>");
		out.println("<b><i>Roll No :</b></i>"+sno+"<br>");
		out.println("<b><i>Name :</b></i>"+snm+"<br>");
		out.println("<b><i>Class :</b></i>"+sclass+"<br>");
		out.println("<b><i>Subject1 :</b></i>"+s1+"<br>");
		out.println("<b><i>Subject2 :</b></i>"+s2+"<br>");
		out.println("<b><i>Subject3 :</b></i>"+s3+"<br>");
		out.println("<b><i>Total :</b></i>"+total+"<br>");
		out.println("<b><i>Percentage :</b></i>"+per+"<br>");
		if(per>50)
		out.print("<h1><i>Pass Class</i></h1>");
		else if(per<55 && per>50)
		out.print("<h1><i>Second Class</i></h1>");
		else if(per<60 && per>=55)
		out.print("<h1><i>Higher Class</i></h1>");
		out.close();

	}

}
