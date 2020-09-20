package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GradesPropeties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
       Properties properties = new Properties();
       
       properties.load(new FileInputStream(new File("d:/mygrade.propeties.txt")));
       
       String id = properties.getProperty("id");
       System.out.println("Ñ§ºÅ£º"+id);
       
       String grade = properties.getProperty("grade");
       System.out.println("java³É¼¨£º"+grade);
       
	}

}
