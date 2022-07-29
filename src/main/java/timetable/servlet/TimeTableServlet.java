package timetable.servlet;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import timetable.service.TimeTableService;
import timetable.service.impl.TimeTableServiceImpl;
import timetable.util.RequestHelper;

public class TimeTableServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	private final TimeTableService timeTableService = new TimeTableServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		RequestHelper.displayRequest(req);
		
		
		
		String year = req.getParameterNames().nextElement();
		if(!year.equals("colleageName")) {
		res.getWriter().print(timeTableService.createTimeTable(Integer.parseInt(year)));
		}
		
		
	}
}
