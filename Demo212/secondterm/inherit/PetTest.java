package inherit;

public class PetTest {

	public static void main(String[] args) {
		
        /*Dog dog1=new Dog("����", 90, 80, "����");
        dog1.print();
        Pet pet1=dog1;
        pet1.print();
        
        /*dog1.eatSomrthing("����");
        System.out.println(dog1.getName()+"��"+dog1.getLegs()+"����");
	
	
	   Penguin peg1=new Penguin("С����",66,88,"��");
	   Pet pet2=peg1;
	   peg1.print();  
	   pet2.print();
	    
	   Cat cat1 =new Cat("���",66,88);
	   
	   System.out.println("------------");
	   
	   Master mst = new Master("����");
	   mst.feed(cat1, "С���");
	 
	   cat1.eatSomething("");
	   mst.feed(dog1,"����");//Pet pet=dog1
	   mst.feed(peg1, "С��");//Pet pet=peg1
	   
	   Pet pet3=mst.getPet("���");
	   pet3.print();
	   
	   Pet pet4=mst.getPet("è��");
	   pet4.print();
	   
	   System.out.println(pet3 instanceof Penguin);
	   System.out.println(pet3 instanceof Dog);
	   System.out.println(pet3 instanceof Pet);
	   System.out.println("---------------------------");
	   mst.playwith(pet3);
	   mst.playwith(pet4);*/
	 
		Dog dog1 = new Dog("����",80,50,"��ë");
		System.out.println(dog1.toString());
		
		Dog dog2 = new Dog("����",80,50,"��ë");
		System.out.println(dog2);
		
		if(dog1.equals(dog2)) {//���Dog����û����дequals���������==��һ���ģ��Ƚϵ������������Ƿ�ָ��ͬһ������ʵ��
			System.out.println("��ͬ�����ݣ�������ʵ����ͬ�����￴����ͬ");
		}else {
			System.out.println("��ͬ�����ݣ�������������ʵ�����ò�ָ��ͬһ������ʵ�������￴����ͬ");
		}
		
	 
	 } 
	
}

	
	
		

