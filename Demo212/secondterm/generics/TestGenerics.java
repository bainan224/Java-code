package generics;

public class TestGenerics {
	public static void main(String[]args) {
		Box<String, Integer> box=new Box<String,Integer>("����",2);
		System.out.println(box);
		
		Box<ToyCat, Cloth>box2 = new Box<>(new ToyCat("è��"),new Cloth());
		System.out.println(box2);
	}

}
