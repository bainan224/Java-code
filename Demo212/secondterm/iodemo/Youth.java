package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Youth {
	@Test  
	public void TestDirectory() {
		File dir1=new File("D:\\Case\\myDir");
		if(dir1.exists()){
			System.out.println("�ļ��Ѵ��ڣ�ɾ��");
			dir1.delete();
		}
		
		if(!dir1.exists()){
			System.out.println("�½��ļ�mydDir");
			dir1.mkdir();
		}  
		
		File file1=new File("D:\\Case\\myDir\\�ҵ��ഺ������.txt");
		if(file1.exists()){
			System.out.println("�ı����ڣ�����ɾ��");
			file1.delete();
		}
		
		if(!file1.exists()){
			try {
				System.out.println("�½��ı������ҵ��ഺ��������");
				file1.createNewFile();
				System.out.println("����·��Ϊ��"+file1.getAbsolutePath());
				System.out.println("�ļ���Ϊ��"+file1.getName());
				System.out.println("��·��Ϊ��"+file1.getParent());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
			
}
