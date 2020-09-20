package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestDogHashSet {
	
	public static void main(String[]args) {
		Set<DogHashSetPrctise> set = new HashSet<DogHashSetPrctise>();
		DogHashSetPrctise dog = new DogHashSetPrctise("张三", "哈士奇", "18014263495");
		set.add(dog);
		set.add(new DogHashSetPrctise("李四", "金毛", "18912376457"));
		set.add(new DogHashSetPrctise("张三", "柴犬", "18014263495"));
		set.add(new DogHashSetPrctise("王五", "柯基", "12374567890"));
		
		Iterator<DogHashSetPrctise> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
