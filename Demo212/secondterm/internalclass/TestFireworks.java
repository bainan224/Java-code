package internalclass;

public class TestFireworks {
	public static void main(String[]args){
		new Fireworks() {

			@Override
			public void boom() {
				// TODO Auto-generated method stub
				this.setBrand("��");
				System.out.println(this.getBrand()+"����ʢ��������ɫ���̻�");
			}
		}.boom();
		
		new Fireworks() {

			@Override
			public void boom() {
				// TODO Auto-generated method stub
				this.setBrand("����");
				System.out.println(this.getBrand()+"��������ž������");
			}
		}.boom();
	}

}
