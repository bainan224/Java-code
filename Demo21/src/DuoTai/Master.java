package DuoTai;

import DuoTai.Pet;

public class Master {
private  String name;
public Master() {
	
}
public Master(String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	
	this.name = name;
}
public void feed(Pet pet,String food) {
	System.out.println(this.getName()+"ι��");
	pet.eatsomething(food);
	pet.print();
}
public Pet getPet(String typeID) {
	
	if("è��".equals(typeID)) {
		 return new Cat("�̰�",521,520);
	}else {"���".equals(typeID); 
		return new Penguin("�װ�", 90, 100,"��");
	}
}
   public void playWith(Pet pet) {
	   if(pet instanceof Cat) {
		   Cat cat=(Cat)pet;
		   cat.catchingFly();
		   }else if(pet instanceof Penguin){
			 Penguin pgn=(Penguin)pet;
			 pgn.swim();
		   }
   }



}
