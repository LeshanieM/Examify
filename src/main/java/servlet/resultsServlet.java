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


@WebServlet("/resultsServlet")
public class resultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentID = request.getParameter("sid");
		
		try {
			List<Results> resDetails = ResultsDBUtil.getResults(studentID);
			request.setAttribute("resDetails", resDetails);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dis = request.getRequestDispatcher("resultsDetails.jsp");
		dis.forward(request, response);
	}

}
