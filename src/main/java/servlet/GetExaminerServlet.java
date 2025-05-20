//IT23154230 - H.H.W.Palliyaguruge.
package servlet;

import java.io.IOException;

import service.ExaminerServiceImpl;
import service.IExaminerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Examiner;

public class GetExaminerServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GetExaminerServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    // Redirect GET requests to POST
	    doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

 		String examinerID = request.getParameter("examinerID");		
 		
		IExaminerService iExaminerService = new ExaminerServiceImpl();
		Examiner examiner = iExaminerService.getExaminerByID(examinerID);
		
		

		request.setAttribute("examiner", examiner);
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/GetExaminer.jsp");
		dispatcher.forward(request, response);
	}
	
	


}
