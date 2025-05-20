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


@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeletePaymentServlet() {
        super();
        // TODO Auto-generated constructor stu
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String PID= request.getParameter("exam1");
		
		boolean isTrue ;
		isTrue = PaymentDBUtil.deletePayment1(PID);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("PaymentInsert.jsp");
        	dis.forward(request, response);
        	
		}else {
			
			List<Payment> Payment1 = PaymentDBUtil.getPaymentDetails(PID);
			request.setAttribute("Payment1", Payment1);
			
			
			//forward a request from one servlet to JSP page
			RequestDispatcher dis = request.getRequestDispatcher("PaymentAccount.jsp");
			
        	dis.forward(request, response);
		}
	
	}

}
