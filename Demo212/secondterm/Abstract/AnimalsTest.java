package Abstract;

public class AnimalsTest {
	
	public static void main(String[]args) {
		
		Sheep sheep = new Sheep("������","ʳ�ݶ���","��ɽ��");
		sheep.print();
		sheep.eatSomething("���");
		sheep.run();
		
		Wolf wolf = new Wolf("��̫��","ʳ�⶯��","�����");
		wolf.print();
		wolf.eatSomething("����");
		wolf.run();
	}

}
