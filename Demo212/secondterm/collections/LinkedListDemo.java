package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[]args) {
		LinkedList<Dog> doglist = new LinkedList<>();
		Dog dog1=new Dog("����", "��Ȯ", 5);
		Dog dog2=new Dog("����", "��ë", 6);
		Dog dog3=new Dog("�԰�", "��ʿ��", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
		
		if(doglist.contains(dog1)) {
			doglist.remove(dog1);
			System.out.println("�����Ѿ���list�У����ѽ���ɾ��");
		}else {
			System.out.println("���в���list��");
		}
		
	    doglist.removeFirst();
		
		System.out.println(doglist.size());
		for(int i=0;i<doglist.size();i++) {
			System.out.println(doglist.get(i));
		}
	}

	

}
