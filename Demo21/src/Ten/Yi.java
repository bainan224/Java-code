package Ten;

public class Yi {

	public static void main(String[] args) {
	int sum=0;	
Loop:for(int j=1;j<5;j++)  {
	sum=0;
	System.out.printf("����%d����\n",j);
	for(int i=1;i<=10;i++){
		System.out.printf("�ڲ��%d����\n",i);
		if(i%2!=0&&j%2==0) {
	continue Loop;
	}
	sum+=i;

	}
	System.out.printf("����%d���㣬�õ��ĺ�Ϊ%d\n",j,sum);
}
}
}