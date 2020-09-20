package inherit;

import inherit.Dog;
import inherit.Penguin;

public class Master {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Master() {
		
	}

	public Master(String name) {
		super();
		this.name = name;
	}
	
	/*public void feed(Penguin peg, String food) {
	    peg.eatSomething(food);
		
	}
	public void feed(Dog dog,String food) {
		dog.eatSomrthing(food);
		
	}*/
	
	public void feed(Pet pet,String food) {
		System.out.println(this.name+"ι��");
		pet.eatSomething(food);
		pet.print();
		
	}
	
	public Pet getPet(String typeID) {
		
		if("��".equals(typeID)) {
			return new Dog("����",88,66,"��ʿ��");
		}
		else if("���".equals(typeID)) {
			return new Penguin("ţ��",77,88,"Ů");
		}else {"è��".equals(typeID);
            return new Cat("����",88,88);
        }
	}
	
	public void playwith(Pet pet) {
		if(pet instanceof Penguin) {
			Penguin peg=(Penguin)pet;
			peg.Swim();
		}else if(pet instanceof Dog) {
			Dog dog =(Dog)pet;
			dog.catchingFlyDisc();
		}else if(pet instanceof Cat) {
		     Cat cat=(Cat)pet;
		     cat.playing();
		}
	}
	
	public void takePetToHospital(Pet pet) {
		
	}
}

