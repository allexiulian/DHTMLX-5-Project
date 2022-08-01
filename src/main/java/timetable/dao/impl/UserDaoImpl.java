package timetable.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import timetable.bean.User;
import timetable.dao.UserDao;
import timetable.util.DataBaseUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		
		String SQL = "SELECT * from public.\"User\" where username = ? AND password = ?";
		
		User user = null;
		
		try (Connection conn = DataBaseUtil.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(SQL);
			stmt.setString(1, userName);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				user = new User();
	            user.setId(rs.getLong(1));
	            user.setUserName(rs.getString(2));
	            user.setPassword(rs.getString(3));
	         }
			
			DataBaseUtil.closeConnection(rs, stmt, conn);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	}

}
