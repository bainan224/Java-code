package Fifthteen;

public class Qi {
	float java;
	float C1;
	float DB;

	public float sumscore() {
		float sumscore=java+C1+DB;
		return sumscore;
	}	
	public float averagescore() {
		float averagescore=(java+C1+DB)/3;
		return averagescore;
		
	}	
		
	public void showsumscore() {
		System.out.println("总成绩为："+sumscore());
		
	}
	
	public void showaveragescore() {
		System.out.println("平均成绩为："+averagescore());
	}




}
