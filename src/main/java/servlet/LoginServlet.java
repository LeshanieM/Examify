//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package servlet;

import java.io.IOException;



import util.LoginUtil;
import model.User;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = LoginUtil.LoginValidate(username, password);
		
		if (isTrue == true) {
			
			List<User> userList = LoginUtil.getLoginUser(username);
			request.setAttribute("userList", userList);//store an object
			
			
			//forward a request from a servlet to JSP page
			RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			dis.forward(request, response);
			
		}else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Invalid username or password');");
			out.println("location = 'Login.jsp'");
			out.println("</script>");
			
		}
	}

}
