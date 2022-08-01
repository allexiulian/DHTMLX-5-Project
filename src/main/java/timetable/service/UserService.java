package timetable.service;

import timetable.bean.User;

public interface UserService {

	public User getByUserNameAndPassword(String userName, String password);
}
