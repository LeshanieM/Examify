//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NewExam;
import service.INewExamService;
import service.NewExamServiceImpl;


@WebServlet("/UpdateNewExamServlet")
public class UpdateNewExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateNewExamServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//signals to the browser that the content is HTML document.
		response.setContentType("text/html");
		
		NewExam newExam = new NewExam();
		
		String eID = request.getParameter("eID");
		
		
		//get parameters from jsp file
		newExam.seteID(eID);
		newExam.setCourseName(request.getParameter("courseName"));
		newExam.setExamType(request.getParameter("examType"));
		newExam.setDate(request.getParameter("date"));
		newExam.setCourseID(request.getParameter("courseID"));
		
		
		//object from INewExamService interface
		INewExamService iNewExamService = new NewExamServiceImpl();
		iNewExamService.updateNewExam(eID,newExam);
		
		//store an object
		request.setAttribute("newExam", newExam);
		
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/allNewExams.jsp");
		dispatcher.forward(request, response);
	}

}
