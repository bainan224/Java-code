package polymorphic;

public class  Foreigner extends Friends{
	
	public Foreigner() {	
	}
	
	public Foreigner(String name,String country) {
		super(name,country);
	}
   
	public void print() {
		System.out.println("--------------------");
		System.out.println("������"+this.getName());
		System.out.println("������"+this.getCountry());
		
	}
	
	public void sayHello(String word) {
		System.out.println(word+",Nice to meet you");
		
	}

	@Override
	protected void language() {
		System.out.println("��������ΪӢ��");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void food() {
		// TODO Auto-generated method stub
		System.out.println("ѡ������");
	}
}
