package timetable.dao;

import timetable.bean.User;

public interface UserDao {
	
	public User findByUserNameAndPassword(String userName, String password);

}
