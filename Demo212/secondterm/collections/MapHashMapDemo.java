package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Dog,String> map = new HashMap<Dog,String>();
		map.put(new Dog("李四", "金毛", 5),"阿黄");
		map.put(new Dog("张三", "哈士奇", 3),"小怪");
		map.put(new Dog("王五", "柴犬", 6),"旺仔");
		System.out.println(map);
		System.out.println(map.size());
		//HashMap的key对象相等的原则同HashSet
		map.put(new Dog("王五", "泰迪", 8),"可乐");
		System.out.println(map);
		System.out.println(map.size());
		
		/*
		 * 第一种遍历，使用entry条目set来遍历，同时使用iterator
		 */System.out.println("-----------------第一种遍历方法--------------");
		
		Set<Map.Entry<Dog,String>> entries = map.entrySet();
        
		Iterator<Map.Entry<Dog,String>> iterator = entries.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Dog, String>entry = iterator.next();
			System.out.println("key="+entry.getKey()+"],vaule=["+entry.getValue()+"]");
		}
		
		System.out.println("-----------------第二种遍历方法--------------");
		for (Map.Entry<Dog,String> entry:entries) {
			System.out.println("key="+entry.getKey()+"],vaule=["+entry.getValue()+"]");
			
		}
		
		System.out.println("-----------------第三种遍历方法,增强for循环遍历KeySet读取key，然后联合Map的get读取value--------------");
		
		Set<Dog> dogset = map.keySet();
		for( Dog dog:dogset) {
			System.out.println("key="+dog+"],vaule=["+map+"]");
			
		}
		
		System.out.println("-----------------第四种遍历方法，使用iterator遍历KeySet读取key，然后联合Map的get读取value--------------");
	    Iterator<Dog> iterator2 = dogset.iterator();
	    
	    while(iterator2.hasNext()) {
	    	Dog dog2 = iterator2.next();
	    	System.out.println("key="+dog2+"],vaule=["+map+"]");
	    }
	}

}
