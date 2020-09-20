package commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatePractise {
	public  static void main(String[]args) {
		
		DateFormat df1 = new SimpleDateFormat(" MM/dd/yyyy,a, HH:mm:ss ",Locale.US);
	    String str1 = "13/03/2019 ,PM, 20:52:44";
	    System.out.println(str1);
	    
	    System.out.println("----------------------");
	    
	    DateFormat df2 = new SimpleDateFormat("E,dd M月 yyyy HH:mm:ss",Locale.CHINA);
	    String  str2 = "星期三, 13 3月 2019 20:48:31";
	    Date date2 = null;
	    try {
			 date2 = df2.parse(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(date2);
	}
}
