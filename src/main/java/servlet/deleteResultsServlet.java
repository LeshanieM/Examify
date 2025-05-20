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


@WebServlet("/deleteResultsServlet")
public class deleteResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RID = request.getParameter("rid");
		
		boolean isTrue;
		
		isTrue = ResultsDBUtil.deleteResults(RID);
		
		if (isTrue == true) {
			//forward a request from one servlet to JSP page
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertResults.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Results> resDetails = ResultsDBUtil.getResultsDetails(RID);
			request.setAttribute("resDetails", resDetails);
			
			//forward a request from one servlet to JSP page
			RequestDispatcher dispatcher = request.getRequestDispatcher("resultsDetails.jsp");
			dispatcher.forward(request, response);
		}
	}

}
