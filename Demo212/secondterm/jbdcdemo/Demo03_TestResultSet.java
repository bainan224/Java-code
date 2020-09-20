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
	 * ResultSet��ʹ�ã� 
	 * 1.����Statement.excuteQurey()�õ�ResultSetʵ��
	 * 2.����ResultSetʵ����ͨ��next������getXXX(index) 
	 * 3. �ر�ResultSetʵ��
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
	 * ResultSetMetaData�ǹ���ResultSet��Ԫ���ݣ�Ҳ���Ƕ��������ֶ���Ϣ��
	   * ������������ֶΣ��ֶε�������ʲô�����ֶοɲ�����Ϊnull��
	   * ֱ�ӿ���ͨ��rs.getMetaData()�õ������Ժ�������DAO������
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
