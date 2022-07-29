package timetable.dao;

import java.util.List;

import timetable.bean.TimeTable;

public interface TimeTableDao {

	List<TimeTable> findAllTimeTableByYear(int year);

}
