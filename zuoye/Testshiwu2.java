package com.shiwu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testshiwu2 implements Runnable{
	Connection connection;
	public Testshiwu2(Connection connection){
		this.connection=connection;
	}
	public void run() {
		String sql1 = "insert into dept2 values(112,'ﬂıﬂıﬂı')";
		PreparedStatement preparedStatement1 = null;
		try {
			connection.setAutoCommit(false);
			preparedStatement1 = connection.prepareStatement(sql1);
			preparedStatement1.execute();
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
