package collections;

import java.util.ArrayList;
import java.util.List;

public class ListSimpleDemo {
	
	public static void main(String[]args) {
		List<String> strlist = new ArrayList<String>();
		
		String abc = new String("abc");
		
		strlist.add(abc);
		strlist.add("def");
		strlist.add(1, "uvw");
		strlist.add("xyz");
		
		for(int i=0;i<strlist.size();i++) {
			System.out.println(strlist.get(i));
		}
		
		strlist.remove(1);
		strlist.remove(abc);
		//strlist.clear();
		System.out.println("-----------------");
		for(int i=0;i<strlist.size();i++) {
			System.out.println(strlist.get(i));
		}
		System.out.println("-----------------");
		
		List<Dog> doglist = new ArrayList<>();
		Dog dog1=new Dog("旺仔", "柴犬", 5);
		Dog dog2=new Dog("阿黄", "金毛", 6);
		Dog dog3=new Dog("霸霸", "哈士奇", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		doglist.add(dog1);
		
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
		
		if(doglist.contains(dog1)) {
			doglist.remove(dog1);
			System.out.println("旺仔已经在list中，我已将其删掉");
		}else {
			System.out.println("旺仔不在list中");
		}
		
		doglist.remove(0);
		
		System.out.println(doglist.size());
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
	}

}
