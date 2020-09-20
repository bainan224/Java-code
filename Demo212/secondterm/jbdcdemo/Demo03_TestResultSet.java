package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

public class Demo03_TestResultSet {
	/*
	 * ResultSet的使用： 
	 * 1.调用Statement.excuteQurey()得到ResultSet实例
	 * 2.遍历ResultSet实例，通过next方法及getXXX(index) 
	 * 3. 关闭ResultSet实例
	 */
	@Test
	public void TestResultSet() {
		PreparedStatement statement = null;

		ResultSet rs = null;

		Connection connection = null;
		
		try {
			connection = DBUtils.getConnection();

			statement = connection.prepareStatement("select id,name,birthday from customers where id=?");
			statement.setInt(1, 3);
			rs = statement.executeQuery();

			while (rs.next()) {
				System.out.println("-----------------------------");
				int id=rs.getInt(1);
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));

			}
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}finally {
			
			DBUtils.closeResource(connection, statement,rs);
			
		}
		
	}
	
	/*
	 * ResultSetMetaData是关于ResultSet的元数据，也就是读出来的字段信息：
	   * 比如读出几个字段，字段的名字是什么，该字段可不可以为null。
	   * 直接可以通过rs.getMetaData()得到。可以后面用于DAO的内容
	 */


	@Test
	public void TestResultSetMetaData() {
		PreparedStatement statement = null;

		ResultSet rs = null;

		Connection connection = null;
		
		try {
			connection = DBUtils.getConnection();

			statement = connection.prepareStatement("select id ID,name,birthday Brith from customers where id=?");
			statement.setInt(1, 3);
			rs = statement.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			for(int i = 0;i<rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnLabel(i+1));
				
			}

	/*		while (rs.next()) {
				System.out.println("-----------------------------");
				int id=rs.getInt(1);
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));

			}*/
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}finally {
			
			DBUtils.closeResource(connection, statement,rs);
			
		}
		
	}




}
