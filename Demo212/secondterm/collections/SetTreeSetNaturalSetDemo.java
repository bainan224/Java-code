package collections;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class SetTreeSetNaturalSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> set = new TreeSet<Dog>();
		set.add( new Dog("����", "��ʿ��", 3));
		Dog dog= new Dog("����", "��ë", 6);
		set.add(dog);
		set.add(new Dog("����", "��ë", 5));
		set.add(new Dog("����", "��ë", 4));

		Iterator<Dog> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
 

}
