package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {
	public static void main(String[]args) {
		List<Dog> doglist = new ArrayList<>();
		Dog dog1=new Dog("旺仔", "柴犬", 5);
		Dog dog2=new Dog("阿黄", "金毛", 6);
		Dog dog3=new Dog("霸霸", "哈士奇", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		
		//遍历的第二种方式，适用于所有collection实现集合类
		System.out.println("-------Iterator遍历collection------");
		Iterator<Dog> iterator = doglist.iterator();
		
		while (iterator.hasNext()) {
			Dog dogtemp = iterator.next();
			System.out.println(dogtemp);
			
		}
		
		//遍历的第三种方式
		System.out.println("------增强for循环遍历list-------");
		for(Dog dog:doglist) {
			System.out.println(dog);
		}
		
	}
	

}
