package timetable.service.impl;

import timetable.bean.User;
import timetable.dao.UserDao;
import timetable.dao.impl.UserDaoImpl;
import timetable.service.UserService;

public class UserServiceImpl implements UserService{

	private final UserDao userDao = new UserDaoImpl();
	
	@Override
	public User getByUserNameAndPassword(String userName, String password) {
		
		return userDao.findByUserNameAndPassword(userName, password);
				
	}

}
