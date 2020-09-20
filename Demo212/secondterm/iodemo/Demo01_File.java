package iodemo;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Demo01_File {
	
	@Test  //JUnit��������Java������ԡ�
	public void TestFile() {
		//System.out.println("JUnit�ĵ�һ������");
		File file1=new File("D:\\Case\\hello.txt");
		if(file1.exists()){
			System.out.println("�ļ����ڣ��Ҿͽ���ɾ��");
			file1.delete();
		}
		
		if(!file1.exists()){
			try {
				System.out.println("�ļ������ڣ��Ҿ��´���һ��");
				file1.createNewFile();
				System.out.println("����·��Ϊ��"+file1.getAbsolutePath());
				System.out.println("�ļ���Ϊ��"+file1.getName());
				System.out.println("��·��Ϊ��"+file1.getParent());
				
				file1.renameTo(new File("D:\\Case\\hello2.txt"));
	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	
	@Test  
	public void TestDirectory() {
		//System.out.println("JUnit�ĵ�һ������");
		File dir1=new File("D:\\Case\\io2");
		if(dir1.exists()){
			System.out.println("Ŀ¼���ڣ��Ҿͽ���ɾ��");
			dir1.delete();
		}
		
		if(!dir1.exists()){
			System.out.println("Ŀ¼�����ڣ��Ҿ��´���һ��");
			dir1.mkdir();
		}  
		
		File dir2=new File("D:\\Case\\io10\\io3\\io4");
		if(dir2.exists()){
			System.out.println("�༶Ŀ¼����");
		}
		
		if(!dir2.exists()){
			System.out.println("�༶Ŀ¼�����ڣ��Ҿ��´�������Ŀ¼�ṹ");
			dir2.mkdirs();
		}  
	} 

}
