package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[]args) {
		LinkedList<Dog> doglist = new LinkedList<>();
		Dog dog1=new Dog("旺仔", "柴犬", 5);
		Dog dog2=new Dog("阿黄", "金毛", 6);
		Dog dog3=new Dog("霸霸", "哈士奇", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
		
		if(doglist.contains(dog1)) {
			doglist.remove(dog1);
			System.out.println("旺仔已经在list中，我已将其删掉");
		}else {
			System.out.println("旺仔不在list中");
		}
		
	    doglist.removeFirst();
		
		System.out.println(doglist.size());
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
	}

	

}
