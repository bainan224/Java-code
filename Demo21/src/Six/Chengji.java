package Six;

public class Chengji {
	public static void main(String[] args) {
		double score = 78;
		if (score >= 85) {
			System.out.println("�ɼ����㣬�����������һ��");
		} else if (score >= 80 && score < 85) {
			System.out.println("�ɼ����ã�����һ���ֻ�");
		} else if (score >= 70 && score < 80) {
			System.out.println("�ɼ��еȣ���������");
		} else if (score >= 60 && score < 70) {
			System.out.println("�ɼ����񣬽���һ֧��");
		} else if (score < 60) {
			System.out.println("�ɼ��������޽���");
		}
	}
}