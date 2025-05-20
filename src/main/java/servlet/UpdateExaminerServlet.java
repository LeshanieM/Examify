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

public class UpdateExaminerServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UpdateExaminerServlet() {
		super();
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		Examiner ex = new Examiner();
		String examinerID = request.getParameter("examinerID");	
		ex.setExaminerID(examinerID);
		ex.setExaminerName(request.getParameter("examinerName"));
		//ex.setContactNo(request.getContentLength());
		try {
		    long contactNo = Long.parseLong(request.getParameter("contact")); // Parse contact as long
		    ex.setContactNo(contactNo); // Set the parsed contact number
		} catch (NumberFormatException e) {
		    // Handle the case where contact number is invalid or empty
		    ex.setContactNo(0); // Set to 0 or handle it appropriately
		    System.out.println("Invalid contact number: " + e.getMessage());
		}
		ex.setAddress(request.getParameter("address"));
		ex.setQualification(request.getParameter("qualification"));
		ex.setEmail(request.getParameter("email"));
		
		IExaminerService iexaminerService = new ExaminerServiceImpl();
		iexaminerService.updateExaminer(examinerID, ex);

		
		//forward a request from a servlet to JSP page
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListExaminer.jsp");
		dispatcher.forward(request, response);
	}

}
