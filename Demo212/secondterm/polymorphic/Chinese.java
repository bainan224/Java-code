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
		System.out.println("姓名："+this.getName());
		System.out.println("国籍："+this.getCountry());
	}

	@Override
	public void sayHello(String word) {
		// TODO Auto-generated method stub
		System.out.println("初次见面，"+word);
	}
	
	public void language() {
		System.out.println("语言类型为中文");
	}
	
	public void food() {
		System.out.println("选择中餐");
	}
}
