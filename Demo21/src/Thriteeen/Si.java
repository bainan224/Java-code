package Thriteeen;

public class Si {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="abc";
	        str = str + "def"+12345;
	        System.out.println(str);
	        
	        int locchar=str.indexOf('d');
	        System.out.println("第"+locchar+"个字符为"+'d');
	        
	        int locsubstr=str.indexOf("123");
	        System.out.println("第"+locsubstr+"个字符为"+"123");
	        
	        String date="20191118";
	        
	        String month=date.substring(4,6);
	        String day=date.substring(6);
	        
	        String words="长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
	        
	        String[] strarr=words.split(" ");
	        for(String word:strarr) {
	        	System.out.println(word);
	        }

	        words="长亭外,古道边,芳草碧连天,晚风扶,柳笛声残 夕阳山外山";
	        
	        strarr=words.split(",");
	        for(String word:strarr) {
	        	System.out.println(word);
	        }
	        
	        System.out.println("月份为"+month+","+day+"号");
	        
	        String str2="xyz";
	        String str3 = str2.concat("abc");
	        System.out.println(str3);
	        
	        
	        
	        
	        
	        
		}

	}
