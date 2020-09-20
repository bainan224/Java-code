package commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);

		Date date2 = new Date(222222222222L);
		System.out.println(date2);
		
        //从日期到字符串 date=>String
		DateFormat df1 = new SimpleDateFormat("MM-dd-yyyy a HH:mm:ss #E", Locale.US);
		String str1 = df1.format(date2);
		System.out.println(str1);
		
		//从字符串生成一个日期date：String=>date
		String str2 = "1977-01-16 AM 08:23:42 #Sun";
		Date date3 = null;
		try {
			date3 = df1.parse(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date3);
	}

}
