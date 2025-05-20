package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.PaymentDBUtil;


@WebServlet("/PaymentInsertServlet")
public class PaymentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PaymentInsertServlet() {
        super();
        
    }


    
   

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		
    		String name = request.getParameter("name1");
    		String number = request.getParameter("name2");
    		String expiry_date =request.getParameter("name3");
    		String cvv = request.getParameter("name4");
    		
    		boolean isTrue;
    		
    		isTrue = PaymentDBUtil.insertPayment(name,number,expiry_date,cvv);
    		
    		if(isTrue == true) {
    			RequestDispatcher dis = request.getRequestDispatcher("Payment.jsp");
    			dis.forward(request, response);
    		}
    		else{
    			
    			//forward a request from a servlet to JSP page
    			RequestDispatcher dis2 = request.getRequestDispatcher("Punsuccess.jsp");
    			dis2.forward(request, response);
    		}
    	}

  }


    	
    		


