package Wangke;

public class Dog extends Pet {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public Dog() {

		System.out.println("����Dog���޲ι��췽��");

	}

	public Dog(String name, int health, int love, String strain) {
		// this.name=name; //����ֱ�ӷ��ʸ����private����
		/*
		 * System.out.println("����Dog���вι��췽��");
		 * super.setName(name);//����ͨ�������public��setter���������ʸ�������� super.setHealth(health);
		 * super.setLove(love); this.strain=strain;
		 */

		super(name, health, love);// ���������Ĵ�����Դﵽͬ����Ч��
		this.strain = strain;
		System.out.println("����Dog���вι��췽��");
	}
}