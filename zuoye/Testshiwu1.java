package com.shiwu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testshiwu1 implements Runnable{
	Connection connection;
	public Testshiwu1(Connection connection){
		this.connection=connection;
	}
	public void run() {
		String sql = "update dept2 set deptname='ǮǮǮ' where deptid=112";
		PreparedStatement preparedStatement = null;
		try {
			
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(sql);
		    preparedStatement.execute();
		    Thread.sleep(5000);
		    connection.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			MysqlUtil.freeconnect(connection);
		}
		
	}
}

