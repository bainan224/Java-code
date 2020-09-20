package generics;

class identityCard {
	public identityCard() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "身份证";
	}
	}
class StudentCard {
	public StudentCard() {
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "学生证" ;
		}

		
}
class FoodCard {
	public FoodCard() {
		
	}
			@Override
	public String toString() {
				// TODO Auto-generated method stub
				return "饭卡";
	}
}


public class Student<P> {
	private P person;

	public P getPerson() {
		return person;
	}

	public void setPerson(P person) {
		this.person = person;
	}

	public Student() {

	}

	public Student(P person) {
		super();
		this.person = person;
	}

	public void print() {
		System.out.println("学生身份认证方式："+this.getPerson());
	}
}
