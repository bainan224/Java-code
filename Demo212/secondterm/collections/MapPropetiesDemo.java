package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MapPropetiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
       Properties properties = new Properties();
       
       properties.load(new FileInputStream(new File("d:/crush.propeties.txt")));
       
       String user = properties.getProperty("user");
       System.out.println(user);
       
       String password = properties.getProperty("password");
       System.out.println(password);
       
       properties.setProperty("user", "张三");
       properties.setProperty("alias", "小张");	
       properties.list(System.out);
       
       properties.store(new FileOutputStream(new File("d:/conf.txt")), "lzk modified");
	}

}
