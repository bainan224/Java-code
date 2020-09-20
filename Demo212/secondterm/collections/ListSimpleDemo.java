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
		Dog dog1=new Dog("����", "��Ȯ", 5);
		Dog dog2=new Dog("����", "��ë", 6);
		Dog dog3=new Dog("�԰�", "��ʿ��", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		doglist.add(dog1);
		
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
		
		if(doglist.contains(dog1)) {
			doglist.remove(dog1);
			System.out.println("�����Ѿ���list�У����ѽ���ɾ��");
		}else {
			System.out.println("���в���list��");
		}
		
		doglist.remove(0);
		
		System.out.println(doglist.size());
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
	}

}
