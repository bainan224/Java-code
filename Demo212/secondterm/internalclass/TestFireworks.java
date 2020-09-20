package internalclass;

public class TestFireworks {
	public static void main(String[]args){
		new Fireworks() {

			@Override
			public void boom() {
				// TODO Auto-generated method stub
				this.setBrand("礼花");
				System.out.println(this.getBrand()+"正在盛开五颜六色的烟花");
			}
		}.boom();
		
		new Fireworks() {

			@Override
			public void boom() {
				// TODO Auto-generated method stub
				this.setBrand("鞭炮");
				System.out.println(this.getBrand()+"正在噼里啪啦的响");
			}
		}.boom();
	}

}
