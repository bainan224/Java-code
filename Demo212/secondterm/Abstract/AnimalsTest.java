package Abstract;

public class AnimalsTest {
	
	public static void main(String[]args) {
		
		Sheep sheep = new Sheep("懒羊羊","食草动物","白山羊");
		sheep.print();
		sheep.eatSomething("青草");
		sheep.run();
		
		Wolf wolf = new Wolf("灰太狼","食肉动物","大灰狼");
		wolf.print();
		wolf.eatSomething("肥羊");
		wolf.run();
	}

}
