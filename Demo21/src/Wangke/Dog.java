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

		System.out.println("子类Dog的无参构造方法");

	}

	public Dog(String name, int health, int love, String strain) {
		// this.name=name; //不能直接访问父类的private属性
		/*
		 * System.out.println("子类Dog的有参构造方法");
		 * super.setName(name);//可以通过父类的public的setter方法来访问父类的属性 super.setHealth(health);
		 * super.setLove(love); this.strain=strain;
		 */

		super(name, health, love);// 这个和上面的代码可以达到同样的效果
		this.strain = strain;
		System.out.println("子类Dog的有参构造方法");
	}
}
