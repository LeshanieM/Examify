// IT23149380 - P.G.T.N.D.Gallage 

package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ResultsDBUtil;


@WebServlet("/insertResultsServlet")
public class insertResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentID = request.getParameter("sid");
		String examID = request.getParameter("eid");
		String marksString = request.getParameter("marks");
		int marks = Integer.parseInt(marksString);
		String grade = request.getParameter("grade");
		
		boolean isTrue;
		
		isTrue = ResultsDBUtil.insertResults(studentID, examID, marks, grade);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else{
			
			//forward a request from a servlet to JSP page
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}


	
		