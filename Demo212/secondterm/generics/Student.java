package generics;

class identityCard {
	public identityCard() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���֤";
	}
	}
class StudentCard {
	public StudentCard() {
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "ѧ��֤" ;
		}

		
}
class FoodCard {
	public FoodCard() {
		
	}
			@Override
	public String toString() {
				// TODO Auto-generated method stub
				return "����";
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
		System.out.println("ѧ�������֤��ʽ��"+this.getPerson());
	}
}
