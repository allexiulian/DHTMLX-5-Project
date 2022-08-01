package timetable.servlet.admin;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import timetable.service.TimeTableService;
import timetable.service.impl.TimeTableServiceImpl;
import timetable.util.RequestHelper;


public class AdminServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private final TimeTableService timeTableService = new TimeTableServiceImpl();
	protected void doGet(HttpServletRequest  req, HttpServletResponse res) throws IOException, ServletException {

		RequestHelper.displayRequest(req);
		
		 
	req.getRequestDispatcher("/WEB-INF/admin/admin.html").forward(req, res);
		
	}
}

