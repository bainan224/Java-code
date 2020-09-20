package internalclass;

public class TestAnonymousClass {
	public static void main(String[] args) {
           new Phone() {

			@Override
			public void netbrowering() {
				this.setBrand("小米手机");
				// TODO Auto-generated method stub
				System.out.println(this.getBrand()+"正在上网");
			}
		}.netbrowering();
		
		System.out.println(new Phone() {

			@Override
			public void netbrowering() {
				
				// TODO Auto-generated method stub
				System.out.println(this.getBrand()+"正在上网");
			}
			
			public int getSize() {
				this.setBrand("苹果手机");
				System.out.print(this.getBrand()+"有内存:");
				return 8;
			}
		}.getSize());  
		
		new Network() {
			String brand="华为";
			@Override
			public void netbrowering() {
				// TODO Auto-generated method stub
				System.out.println(this.brand+"正在愉快的上网！");
			}
		}.netbrowering();
	}

}
