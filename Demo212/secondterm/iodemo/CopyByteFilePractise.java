package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class CopyByteFilePractise {
	
	@Test
	public void copyByteFile() {
		File file1 = new File("D:\\Case\\myDir\\NASA.png");
		File file2 = new File("C:\\Case\\myDir\\NASAcopyed.png");
		if(file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file2);
			fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
