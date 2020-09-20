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
		System.out.println(this.name+"Î¹¸ø");
		pet.eatSomething(food);
		pet.print();
		
	}
	
	public Pet getPet(String typeID) {
		
		if("¹·".equals(typeID)) {
			return new Dog("Íú×Ð",88,66,"¹þÊ¿Ææ");
		}
		else if("Æó¶ì".equals(typeID)) {
			return new Penguin("Å£ÄÌ",77,88,"Å®");
		}else {"Ã¨ßä".equals(typeID);
            return new Cat("ºËÌÒ",88,88);
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

