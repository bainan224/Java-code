package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {
	public static void main(String[]args) {
		List<Dog> doglist = new ArrayList<>();
		Dog dog1=new Dog("����", "��Ȯ", 5);
		Dog dog2=new Dog("����", "��ë", 6);
		Dog dog3=new Dog("�԰�", "��ʿ��", 3);
		
		doglist.add(dog1);
		doglist.add(dog2);
		doglist.add(dog3);
		
		//�����ĵڶ��ַ�ʽ������������collectionʵ�ּ�����
		System.out.println("-------Iterator����collection------");
		Iterator<Dog> iterator = doglist.iterator();
		
		while (iterator.hasNext()) {
			Dog dogtemp = iterator.next();
			System.out.println(dogtemp);
			
		}
		
		//�����ĵ����ַ�ʽ
		System.out.println("------��ǿforѭ������list-------");
		for(Dog dog:doglist) {
			System.out.println(dog);
		}
		
	}
	

}
