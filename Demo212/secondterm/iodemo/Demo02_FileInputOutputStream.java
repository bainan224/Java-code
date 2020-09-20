package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Demo02_FileInputOutputStream {
	
	@Test
	public void TestFileInputStream() {
		
		//File file1 = new File("D:\\Case\\helloword3.txt");
		//File file1 = new File("D:/Case/helloword3.txt");
		File file1 = new File("D:"+File.separator+"Case"
		+File.separator+"helloword3.txt");
		
		/*
		 * ����һ���ļ������ֽ���
		 */
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		 * ��ʼ���ļ�
		 */
		
		byte[] bytes = new byte[6];
		int len = -1;
/*		do {
			try {
				end = fis.read(bytes);
				System.out.println("���ζ���"+end+"���ֽ�");
				if(end==-1) {
					break;
				}
				System.out.println(new String(bytes,0,end));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while (end!=-1);*/
		try {
			while((len=fis.read(bytes))!=-1) {
				System.out.println("���ζ���"+len+"���ֽ�");
				for(int i=0;i<len; i++) {
					System.out.println(bytes[i]+"");
				}
				System.out.println("");
				//System.out.println(new String(bytes,0,end));
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		 * ����Ӧ�����ر�
		 */
		if(fis!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	@Test
	public void TestFileOutputStream() {
		File file1 = new File("D:"+File.separator+"Case"
				+File.separator+"helloword4.txt");
		
		if (file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		 * ���������
		 */
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file1,true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] bytes = null;
		bytes="abcdefghijklmn".getBytes();
		
		try {
			//fos.write(98);//д����ASCIIΪ98���ַ���Ҳ���ǡ�b��
			fos.write(bytes);
			//fos.write(bytes,5,5);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(fos!=null) {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void copyByteFile() {
		File file1 = new File("D:\\Case\\myVideo\\example.mp4");
		File file2 = new File("D:\\Case\\myVideo\\examplecopyed.mp4");
		if(file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * ����������
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file2);
			fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * һ�����Ƕ���һ������д
		 */
		byte[] bytes = new byte[1024];
		int len=-1;
		try {
			while ((len=fis.read(bytes))!=-1 ){
				fos.write(bytes,0,len);
				
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
