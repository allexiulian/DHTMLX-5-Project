package timetable.servlet.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import timetable.service.UserService;
import timetable.service.impl.UserServiceImpl;


public class LoginServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private final UserService userService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		
		req.getRequestDispatcher("login.html").forward(req, res);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		String usr = req.getParameter("userName");
		String pwd = req.getParameter("password");
		
		
		if(userService.getByUserNameAndPassword(usr, pwd)==null){
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);
			res.getWriter().print("User or password INVALID!");
		}else {
			res.sendRedirect("admin");

		}
		
		
	}

}
