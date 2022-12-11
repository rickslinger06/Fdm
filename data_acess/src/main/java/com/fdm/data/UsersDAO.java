package com.fdm.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO implements IUsers{
	
	private String url = "jdbc:h2:file:/Users/rickstermuyco/h2/dataBasePractice;AUTO_SERVER=TRUE";
	private String userName = "sa";
	private String userPass = "test";
	
	private static final String SELECT_ALL_USERS = "select * from listUsers";

	
	
	public List<User> listUsers(){
		
		List<User> users = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url,userName,userPass);
				
			PreparedStatement ps = conn.prepareStatement(SELECT_ALL_USERS);){
			
			
			System.out.println(ps);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int userID = rs.getInt("userID");
                String userName = rs.getString("userName");
               
                
                users.add(new User(userID, userName));
				
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}


	@Override
	public void addUser(User user) {
		
		
	}


	@Override
	public User getUser(String Uname) {
		try {
			Connection conn =  DriverManager.getConnection(url,userName, userPass);
			
			PreparedStatement ps  = conn.prepareStatement("Select * from ListUsers WHERE username" + Uname + ";");{
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				User user = new User();
				user.setUserID(rs.getInt("UserID"));
				user.setUserName(rs.getString("userName"));
				
				return user;
			}
			
			}	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public void removeUser(String username) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
