package Abstract;

public class AbsPetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Dog dog1=new Dog("旺财", 90, 80, "京巴");
        dog1.print();
        
        dog1.setHealth(60);
        dog1.setLove(70);
        
        dog1.print();
//		Dog dog2=new Dog();
		
		Dog dog3=new Dog("旺财", 90, 80, "京巴");
        
        dog3.print();
        dog3.eatSomrthing("狗粮");
        System.out.println(dog3.getName()+"有"+dog3.getLegs()+"条腿");
	
	
	   Penguin peg=new Penguin("小飞侠",66,88,"男");
	
	   peg.print();
	}
		*/
	  FacDog apet1=new FacDog("旺仔",88,66,"哈士奇");
	  apet1.print();
	  apet1.eatSomething("狗粮");
	  System.out.println(apet1.getName()+"有"+apet1.GetLegs()+"条腿");
	  
	}
}
	