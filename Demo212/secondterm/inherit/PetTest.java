package inherit;

public class PetTest {

	public static void main(String[] args) {
		
        /*Dog dog1=new Dog("旺财", 90, 80, "京巴");
        dog1.print();
        Pet pet1=dog1;
        pet1.print();
        
        /*dog1.eatSomrthing("狗粮");
        System.out.println(dog1.getName()+"有"+dog1.getLegs()+"条腿");
	
	
	   Penguin peg1=new Penguin("小飞侠",66,88,"男");
	   Pet pet2=peg1;
	   peg1.print();  
	   pet2.print();
	    
	   Cat cat1 =new Cat("坚果",66,88);
	   
	   System.out.println("------------");
	   
	   Master mst = new Master("张三");
	   mst.feed(cat1, "小鱼干");
	 
	   cat1.eatSomething("");
	   mst.feed(dog1,"狗粮");//Pet pet=dog1
	   mst.feed(peg1, "小鱼");//Pet pet=peg1
	   
	   Pet pet3=mst.getPet("企鹅");
	   pet3.print();
	   
	   Pet pet4=mst.getPet("猫咪");
	   pet4.print();
	   
	   System.out.println(pet3 instanceof Penguin);
	   System.out.println(pet3 instanceof Dog);
	   System.out.println(pet3 instanceof Pet);
	   System.out.println("---------------------------");
	   mst.playwith(pet3);
	   mst.playwith(pet4);*/
	 
		Dog dog1 = new Dog("阿黄",80,50,"金毛");
		System.out.println(dog1.toString());
		
		Dog dog2 = new Dog("阿黄",80,50,"金毛");
		System.out.println(dog2);
		
		if(dog1.equals(dog2)) {//如果Dog类中没有重写equals方法，则和==是一样的，比较的是两个引用是否指向同一个对象实例
			System.out.println("相同的内容，但对象实例不同，这里看做相同");
		}else {
			System.out.println("相同的内容，但因两个对象实例引用不指向同一个对象实例，这里看做不同");
		}
		
	 
	 } 
	
}

	
	
		

