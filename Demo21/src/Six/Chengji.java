package Six;

public class Chengji {
	public static void main(String[] args) {
		double score = 78;
		if (score >= 85) {
			System.out.println("成绩优秀，奖励外出旅游一次");
		} else if (score >= 80 && score < 85) {
			System.out.println("成绩良好，奖励一部手机");
		} else if (score >= 70 && score < 80) {
			System.out.println("成绩中等，奖励本子");
		} else if (score >= 60 && score < 70) {
			System.out.println("成绩及格，奖励一支笔");
		} else if (score < 60) {
			System.out.println("成绩不及格，无奖励");
		}
	}
}