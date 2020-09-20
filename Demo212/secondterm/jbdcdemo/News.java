package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class News {
	@Test
	public void TestNewsStatement() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/myjavadb";

		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "root123");
			System.out.println(connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = "insert into news(number,writer,title,time) values('3','东野圭吾','放学后','2006-8-11')";
		
		if (connection != null) {
			try {
				statement = connection.createStatement();
				System.out.println(statement.execute(sql));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	@Test
	public void TestResultNews()  {
		PreparedStatement statement = null;

		ResultSet rs = null;

		Connection connection = null;
		
		
		try {
			connection = DBUtils.getConnection();

			statement = connection.prepareStatement("select number,,writer,title,time from news ");
			
			rs = statement.executeQuery();

			while (rs.next()) {
				System.out.println("-----------------------------");
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDate(4));

			}
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}finally {
			
			DBUtils.closeResource(connection, statement,rs);
			
		}
		
	}

}
