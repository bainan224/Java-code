package polymorphic;

public class Chinese extends Friends{
	public Chinese() {
		
	}

	public Chinese(String name,String country) {
		super(name,country);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("������"+this.getName());
		System.out.println("������"+this.getCountry());
	}

	@Override
	public void sayHello(String word) {
		// TODO Auto-generated method stub
		System.out.println("���μ��棬"+word);
	}
	
	public void language() {
		System.out.println("��������Ϊ����");
	}
	
	public void food() {
		System.out.println("ѡ���в�");
	}
}
