package timetable.service.impl;

import java.util.List;

import timetable.bean.TimeTable;
import timetable.dao.TimeTableDao;
import timetable.dao.impl.TimeTableDaoImpl;
import timetable.service.TimeTableService;

public class TimeTableServiceImpl implements TimeTableService {

	private final TimeTableDao timeTableDao = new TimeTableDaoImpl();
	
	@Override
	public StringBuilder createTimeTable(int year) {
		
		List<TimeTable> list  = timeTableDao.findAllTimeTableByYear(year);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<table id=\"timeTable\">\n"
				+ "  <tr>\n"
				+ "    <th>Day</th>\n"
				+ "    <th>Time</th>\n"
				+ "    <th>Subject</th>\n"
				+ "    <th>Building</th>\n"
				+ "    <th>Teacher</th>\n"
				+ "  </tr>");
		for(TimeTable elem : list) {
			sb.append("<tr>")
			.append("<td>").append(elem.getDay()).append("</td>")
			.append("<td>").append(elem.getStartTime()).append("-").append(elem.getEndTime()).append("</td>")
			.append("<td>").append(elem.getSubject()).append("(").append(elem.getSubjectType()).append(")").append("</td>")
			.append("<td>").append(elem.getBuilding()).append(elem.getRoom()).append("</td>")
			.append("<td>").append(elem.getTeacher()).append("</td>")
			.append("</tr>");
			

					
		}
		sb.append("</table>");
		
		return sb;
		
	}

}
