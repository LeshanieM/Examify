//IT23154230 - H.H.W.Palliyaguruge.
package servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Examiner;
import service.ExaminerServiceImpl;
import service.IExaminerService;


public class AddExaminerServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddExaminerServlet() {
		super();
	}
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//signals to the browser that the content is HTML document.
		response.setContentType("text/html");

		Examiner examiner = new Examiner();
		
		examiner.setExaminerName(request.getParameter("examinerName"));
		//examiner.setContactNo(request.getParameter("contact"));
		// Handle the contact number conversion
		try {
		    long contactNo = Long.parseLong(request.getParameter("contact")); // Parse contact as long
		    examiner.setContactNo(contactNo); // Set the parsed contact number
		} catch (NumberFormatException e) {
		    // Handle the case where contact number is invalid or empty
		    examiner.setContactNo(0); // Set to 0 or handle it appropriately
		    System.out.println("Invalid contact number: " + e.getMessage());
		}
		examiner.setAddress(request.getParameter("address"));
		examiner.setQualification(request.getParameter("qualification"));
		examiner.setEmail(request.getParameter("email"));
		
		IExaminerService iExaminerService = new ExaminerServiceImpl();
		iExaminerService.addExaminer(examiner);
		
		
		//store an object
		request.setAttribute("examiner", examiner);
		
		//forward a request from a servlet to JSP page
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListExaminer.jsp");
		dispatcher.forward(request, response);
	}

}

