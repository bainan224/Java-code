package iodemo;

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

import org.junit.jupiter.api.Test;

public class Demo04_BufferedFileInputOutputStream2 {

	@Test
	public void copyByteFile() {

		File file1 = new File("D:\\Case\\myVideo\\example2.mp4");
		File file2 = new File("D:\\Case\\myVideo\\examplecopyed2.mp4");
		if (file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * ���������ڵ�����ͬʱʹ�û�������װ��Ӧ�Ľڵ���
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		

		try {
			fos = new FileOutputStream(file2);
			//��������װ�ڵ�������--�ļ��ֽ�������
			fis = new FileInputStream(file1);
			
			bis = new BufferedInputStream(fis);
			//��������װ�ڵ������--�ļ��ֽ������
			bos = new BufferedOutputStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long begin = System.currentTimeMillis();

		/*
		 * һ�����Ƕ���һ������д
		 */
		byte[] bytes = new byte[1024];
		int len = -1;
		try {
			while ((len = bis.read(bytes)) != -1) {
				bos.write(bytes, 0, len);

			}
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("��������ʱ��" + (end - begin) + "����");

		if (fis != null)
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (fos != null)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (bis != null)
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (bos != null)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
