//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.INewExamService;
import service.NewExamServiceImpl;

@WebServlet("/DeleteNewExamServlet")
public class DeleteNewExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteNewExamServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//signals to the browser that the content is HTML document.
		response.setContentType("text/html");
		
		String eID = request.getParameter("eID");
		
		//object from INewExamService interface
		INewExamService iNewExamService = new NewExamServiceImpl();
		iNewExamService.DeleteNewExam(eID);
		
		//store an object
		request.setAttribute("eID", eID);
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/allNewExams.jsp");
		dispatcher.forward(request, response);
	}

}
