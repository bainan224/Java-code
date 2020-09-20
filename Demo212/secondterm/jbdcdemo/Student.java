package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Student {
	@Test
	public void TestStudentStatement() {
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

		String sql = "insert into student(number,name,birthday,grade) values('5','Õı∆ﬂ','2003-5-11','85')";
		//String sql = "delete from student where id='2'";
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
}