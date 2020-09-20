package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> set = new HashSet<Dog>();
		Dog dog = new Dog("张三", "哈士奇", 3);
		set.add(dog);
		set.add(new Dog("李四", "金毛", 5));

		set.add(new Dog("张三", "哈士奇", 3));
		
		Iterator<Dog> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
