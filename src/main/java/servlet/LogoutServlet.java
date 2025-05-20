//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
        // Invalidate the session
        request.getSession().invalidate();
        
        
        // Redirect to the login page 
        response.sendRedirect("Login.jsp");
    }
}
