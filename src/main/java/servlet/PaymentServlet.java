package servlet;

import java.io.IOException;

import model.Payment;

import util.PaymentDBUtil; 

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PaymentServlet() {
        super();
        
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String PID = request.getParameter("text1");
		
		try {
		List<Payment> Payment1 = PaymentDBUtil.ValidatePaymentDetails(PID);
		request.setAttribute("Payment1", Payment1);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//forward a request from a servlet to JSP page
		RequestDispatcher dis1 = request.getRequestDispatcher("PaymentAccount.jsp");
		dis1.forward(request, response);
	}

}
