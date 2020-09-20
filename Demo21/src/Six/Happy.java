package Six;

public class Happy {
	public static void main(String[] args) {
       double score =86;
	  if(score>90) {
	System.out.println("成绩不错，奖励一台电脑");
	}
	
	double javaScore=90,musicScore=85;
	if(javaScore>=98&&musicScore>80) {
	System.out.println("两门成绩皆可，奖励一下");
	}
	
	javaScore=100;
	musicScore=78;
	if(javaScore>=100&&musicScore>70) {
	System.out.println("一门成绩极好，其他尚可，奖励一下");
	}
	
	
	
	}
}