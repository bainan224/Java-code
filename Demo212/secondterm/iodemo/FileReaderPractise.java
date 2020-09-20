package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileReaderPractise {

	@Test
	public void TestReader() {
		File file1 = new File("D:\\Case\\myDir\\我的青春我做主.txt");

		FileReader fr = null;
		try {
			fr = new FileReader(file1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		char[] chars = new char[30];
		int len = -1;
		try {
			while ((len = fr.read(chars)) != -1) {
				System.out.println("本次读出" + len + "个字符");

				for (int i = 0; i < len; i++) {
					System.out.println(chars[i] );
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (fr != null) {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Test
	public void copyCharFile() {

		File file1 = new File("D:\\Case\\myDir\\我的青春我做主.txt");
		File file2 = new File("D:\\Case\\myDir\\我的青春我做主2.txt");

		if (file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

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

		char[] chars = new char[128];
		int len = -1;
		try {
			while ((len = fis.read(chars)) != -1) {
				System.out.println(new String(chars));
				fos.write(chars, 0, len);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	}

}
