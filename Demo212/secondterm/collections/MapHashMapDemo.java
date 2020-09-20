package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Dog,String> map = new HashMap<Dog,String>();
		map.put(new Dog("����", "��ë", 5),"����");
		map.put(new Dog("����", "��ʿ��", 3),"С��");
		map.put(new Dog("����", "��Ȯ", 6),"����");
		System.out.println(map);
		System.out.println(map.size());
		//HashMap��key������ȵ�ԭ��ͬHashSet
		map.put(new Dog("����", "̩��", 8),"����");
		System.out.println(map);
		System.out.println(map.size());
		
		/*
		 * ��һ�ֱ�����ʹ��entry��Ŀset��������ͬʱʹ��iterator
		 */System.out.println("-----------------��һ�ֱ�������--------------");
		
		Set<Map.Entry<Dog,String>> entries = map.entrySet();
        
		Iterator<Map.Entry<Dog,String>> iterator = entries.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Dog, String>entry = iterator.next();
			System.out.println("key="+entry.getKey()+"],vaule=["+entry.getValue()+"]");
		}
		
		System.out.println("-----------------�ڶ��ֱ�������--------------");
		for (Map.Entry<Dog,String> entry:entries) {
			System.out.println("key="+entry.getKey()+"],vaule=["+entry.getValue()+"]");
			
		}
		
		System.out.println("-----------------�����ֱ�������,��ǿforѭ������KeySet��ȡkey��Ȼ������Map��get��ȡvalue--------------");
		
		Set<Dog> dogset = map.keySet();
		for( Dog dog:dogset) {
			System.out.println("key="+dog+"],vaule=["+map+"]");
			
		}
		
		System.out.println("-----------------�����ֱ���������ʹ��iterator����KeySet��ȡkey��Ȼ������Map��get��ȡvalue--------------");
	    Iterator<Dog> iterator2 = dogset.iterator();
	    
	    while(iterator2.hasNext()) {
	    	Dog dog2 = iterator2.next();
	    	System.out.println("key="+dog2+"],vaule=["+map+"]");
	    }
	}

}
