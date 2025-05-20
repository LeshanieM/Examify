// IT23149380 - P.G.T.N.D.Gallage 

package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Results;
import util.ResultsDBUtil;


@WebServlet("/updateResultsServlet")
public class updateResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RID = request.getParameter("rid");
		String studentID = request.getParameter("sid");
		String examID = request.getParameter("eid");
		String marks = request.getParameter("marks");
		String grade = request.getParameter("grade");
		
		boolean isTrue;
		
		isTrue = ResultsDBUtil.updateResults(RID, studentID, examID, marks, grade);
		
		if(isTrue == true) {
			
			List<Results> resDetails = ResultsDBUtil.getResultsDetails(RID);
			request.setAttribute("resDetails", resDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("resultsDetails.jsp");
			dis.forward(request, response);
		}
		else {
			List<Results> resDetails = ResultsDBUtil.getResultsDetails(RID);
			request.setAttribute("resDetails", resDetails);
			
			
			//forward a request from one servlet to JSP page
			RequestDispatcher dis = request.getRequestDispatcher("resultsDetails.jsp");
			dis.forward(request, response);
		}
				
	}

}
