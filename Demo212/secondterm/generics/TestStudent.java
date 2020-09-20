package generics;

public class TestStudent {
	public static void main(String[] args) {
		
		Student<identityCard> student2 = new Student<>(new identityCard());
		student2.print();

		Student<StudentCard> student3 = new Student<>(new StudentCard());
		student3.print();

		Student<FoodCard> student4 = new Student<>(new FoodCard());
		student4.print();
	}
}
