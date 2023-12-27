package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet(name = "myLifeCycleServlet", urlPatterns = { "/lifeCycle" })
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void init() {
		System.out.println("Inside init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing this client");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Demonstrating Servlet Life Cycle</h2>");
	}

}












