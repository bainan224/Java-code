package collections;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;


public class SetLinkedHashSetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> set = new LinkedHashSet<Dog>();
		set.add( new Dog("张三", "哈士奇", 3));
		Dog dog= new Dog("李四", "金毛", 4);
		set.add(dog);
		set.add(new Dog("王五", "金毛", 5));
		set.add(new Dog("赵六", "金毛", 5));

		set.add(new Dog("张三", "哈士奇", 3));
		
		Iterator<Dog> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


}
