package internalclass;

public class TestAnonymousClass {
	public static void main(String[] args) {
           new Phone() {

			@Override
			public void netbrowering() {
				this.setBrand("С���ֻ�");
				// TODO Auto-generated method stub
				System.out.println(this.getBrand()+"��������");
			}
		}.netbrowering();
		
		System.out.println(new Phone() {

			@Override
			public void netbrowering() {
				
				// TODO Auto-generated method stub
				System.out.println(this.getBrand()+"��������");
			}
			
			public int getSize() {
				this.setBrand("ƻ���ֻ�");
				System.out.print(this.getBrand()+"���ڴ�:");
				return 8;
			}
		}.getSize());  
		
		new Network() {
			String brand="��Ϊ";
			@Override
			public void netbrowering() {
				// TODO Auto-generated method stub
				System.out.println(this.brand+"��������������");
			}
		}.netbrowering();
	}

}
