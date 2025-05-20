package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Payment;
import util.PaymentDBUtil;

@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdatePaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String PID = request.getParameter("exam1");
		String Name = request.getParameter("exam2");
		String number = request.getParameter("exam3");
		String expiry_date = request.getParameter("exam4");
		String cvv = request.getParameter("exam5");
	
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.updatePayment(PID, Name, number, expiry_date, cvv);
		
		if(isTrue == true) {
			//retrieve updated values
			List<Payment> Payment1 = PaymentDBUtil.getPaymentDetails(PID);
			request.setAttribute("Payment1", Payment1);
			
			
			//forward a request from a servlet to JSP page
			RequestDispatcher dis = request.getRequestDispatcher("PaymentAccount.jsp");
			dis.forward(request, response);
			
		}else {
			
			//retrieve not updated values
			List<Payment> Payment1 = PaymentDBUtil.getPaymentDetails(PID);
			request.setAttribute("Payment1", Payment1);
			
			RequestDispatcher dis = request.getRequestDispatcher("PaymentAccount.jsp");
			dis.forward(request, response);
		}
	}
}


