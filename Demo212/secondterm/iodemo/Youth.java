package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Youth {
	@Test  
	public void TestDirectory() {
		File dir1=new File("D:\\Case\\myDir");
		if(dir1.exists()){
			System.out.println("文件已存在，删除");
			dir1.delete();
		}
		
		if(!dir1.exists()){
			System.out.println("新建文件mydDir");
			dir1.mkdir();
		}  
		
		File file1=new File("D:\\Case\\myDir\\我的青春我做主.txt");
		if(file1.exists()){
			System.out.println("文本存在，将其删除");
			file1.delete();
		}
		
		if(!file1.exists()){
			try {
				System.out.println("新建文本：《我的青春我做主》");
				file1.createNewFile();
				System.out.println("绝对路径为："+file1.getAbsolutePath());
				System.out.println("文件名为："+file1.getName());
				System.out.println("父路径为："+file1.getParent());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
			
}
