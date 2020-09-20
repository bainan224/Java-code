package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.HashMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Dog,String> map =  new TreeMap<Dog,String>();
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
	}

}
