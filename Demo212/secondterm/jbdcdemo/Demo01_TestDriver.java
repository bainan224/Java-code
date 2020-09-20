package jbdcdemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;


public class Demo01_TestDriver {
	
	/* 最常见的一种数据库链接获取方式
	 * 1. 将数据库驱动程序加入项目
	 * 2. 调用Class.forName(驱动程序类名称)来加载对应数据库的驱动程序
	 * 3. 调用DriverManager.getConnection(url,username,password)来得到数据库链接
	 * 4. 关闭第三步获得的数据库链接。 
	 */
	@Test
	public void testDriverManager(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/myjavadb";
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, "root", "root");
			System.out.println(connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testDriverManagerOptimized(){
		
		Connection connection=null;
		try {
			connection=DBUtils.getConnection();
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
        DBUtils.closeResource(connection, null);
	}
	/*
	 * 直接使用数据库驱动程序的类实例来得到数据库链接，代码复用性不好，不建议使用
	 * 1. 直接通过数据库驱动中的实现类来得到Driver接口实例；
	 * 2. 通过Driver的connect方法得到数据库链接，
	 *    参数为url和标识用户信息的Properties实例(至少要包括user和password两个属性)
	 * 3. 关闭第2步得到的数据库链接。
	 */
	@Test
	public void testDriver(){
		Driver driver = null;
		Connection connection=null;
		
		try {
			driver = new com.mysql.jdbc.Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/myjavadb";
		Properties prop=new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		try {
			connection=driver.connect(url, prop);
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
 