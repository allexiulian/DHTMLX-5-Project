package timetable.dao.impl;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import timetable.bean.TimeTable;
import timetable.dao.TimeTableDao;
import timetable.util.DataBaseUtil;

public class TimeTableDaoImpl implements TimeTableDao{

	@Override
	public List<TimeTable> findAllTimeTableByYear(int year) {
		
		
		 String SQL = "SELECT * from public.\"TimeTable\" where study_year = ? ORDER BY "
				 +"CASE "
				 	+ "WHEN day_name = 'Monday' THEN 1 "
				 	+ "WHEN day_name = 'Tuesday' THEN 2 "
				 	+ "WHEN day_name = 'Wednesday' THEN 3 "
				 	+ "WHEN day_name = 'Thursday' THEN 4 "
				 	+ "WHEN day_name = 'Friday' THEN 5 "
             	 + "END ASC "
                 + ", start_time;";
		            
		 List<TimeTable> list = new ArrayList<>();
		
		  
	      try(Connection conn = DataBaseUtil.getConnection()){
	         PreparedStatement stmt = conn.prepareStatement(SQL);
	         stmt.setInt(1, year);
	         
	         ResultSet rs = stmt.executeQuery();
	      	 
	         while(rs.next()){
	            TimeTable obj = new TimeTable();
	            	obj.setId(rs.getLong(1));
	            	obj.setDay(rs.getString(2));
	            	obj.setStartTime(rs.getString(3));
	            	obj.setEndTime(rs.getString(4));
	            	obj.setSubject(rs.getString(5));
	            	obj.setSubjectType(rs.getString(6));	
	            	obj.setBuilding(rs.getString(7));
	            	obj.setRoom(rs.getString(8));
	            	obj.setTeacher(rs.getString(9));   
	                list.add(obj);
	            	System.out.println(obj);
	         }
	         DataBaseUtil.closeConnection(rs, stmt, conn);
	      } catch (SQLException | ClassNotFoundException e) {
	         e.printStackTrace();
	      } 
	   
		return list;
	}

}
