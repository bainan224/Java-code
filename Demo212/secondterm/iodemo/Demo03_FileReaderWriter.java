package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Demo03_FileReaderWriter {
	
	@Test
	public void TestReader() {
		
		//File file1 = new File("D:\\Case\\helloword3.txt");
		//File file1 = new File("D:/Case/helloword3.txt");
		File file1 = new File("D:"+File.separator+"Case"
		+File.separator+"helloword3.txt");
		
		/*
		 *  创建一个文件输入字符流（和源文件存储时使用的字符编码方式相关），FileReader ISO-XXXX-1编码（和ANSI兼容的）
		 */
		FileReader fr = null;
		try {
			fr = new FileReader(file1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		 * 开始读文件
		 */
		
		char[] chars = new char  [30];
		int len = -1;

		try {
			while((len=fr.read(chars))!=-1) {
				System.out.println("本次读出"+len+"个字符");
				
				/*
				 * 如果文件是UTF-8编码的，那么我需要转化：
				 */
				String str=new String(chars);
				byte[] bytes=str.getBytes();
				str=new String(bytes,"UTF-8");
				System.out.println("转化后的汉字序列为"+str);	
				
				for(int i=0;i<len; i++) {
					System.out.println(chars[i]+"");
				}
				System.out.println("");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		 * 将对应的流关闭
		 */
		if(fr!=null) {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	@Test
	public void TestWriter() {
		File file1 = new File("D:"+File.separator+"Case"
				+File.separator+"helloword6.txt");
		
		if (file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		 * 生成输出流
		 */
		FileWriter fw = null;
		
			try {
				fw = new FileWriter(file1,true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		char[] chars = null;
		chars="你好，我是一名学生".toCharArray();
		
		try {
			fw.write(chars);
			System.out.println("刚才我添加了:"+new String(chars));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void copyCharFile () {
		//用字符流去拷贝字节文件（以字节为单位组织的文件）是无法实现拷贝的，它只能处理文本文件。
/*		File file1 = new File("D:\\Case\\myVideo\\example.mp4");
		File file2 = new File("D:\\Case\\myVideo\\examplecopyed.mp4");*/
		
		File file1 = new File("d:\\Case\\file1.txt");
		File file2 = new File("d:\\Case\\file2.txt");

		if(file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * 生成两个流
		 */
		FileReader fis = null;
		FileWriter fos = null;
		
		try {
			try {
				fos = new FileWriter(file2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fis = new FileReader(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 一个流是读，一个流是写
		 */
		char[] chars = new char[128];
		int len=-1;
		try {
			while ((len=fis.read(chars))!=-1 ){
				System.out.println(new String(chars));
				fos.write(chars,0,len);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(fis!=null)
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(fos!=null)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
