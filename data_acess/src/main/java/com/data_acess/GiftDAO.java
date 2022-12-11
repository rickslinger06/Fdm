package com.data_acess;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GiftDAO implements Pesistable {

	private Connection conn;
	
	public GiftDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public void addGift(Gift gift) {
		PreparedStatement insertStmt = null;
		try {
			String insertString = "INSERT INTO gift_list (ID, name, gift, price)" +
					"VALUES(nextval('gift_list_seq'), ?, ? , ? )";
			insertStmt = conn.prepareStatement(insertString);
			
			insertStmt.setString(1, gift.getName());
			insertStmt.setString(2, gift.getGift());
			insertStmt.setInt(3, gift.getPrice());
			insertStmt.executeUpdate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			
				insertStmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Gift getGift(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGift(String name) {
		// TODO Auto-generated method stub
		
	}

}
