//IT23154230 - H.H.W.Palliyaguruge.
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListExaminerServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ListExaminerServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListExaminer.jsp");
		dispatcher.forward(request, response);
	}


}
