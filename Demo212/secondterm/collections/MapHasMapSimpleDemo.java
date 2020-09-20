package collections;

import java.util.HashMap;
import java.util.Map;

public class MapHasMapSimpleDemo {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("CN", "�л����񹲺͹�");
		map.put("US", "�����Ṳ�͹�");
		map.put("UK", "���е߼�����������������");
		map.put("FR", "���������͹�");
		System.out.println(map.size());
		System.out.println(map.get("UK"));
		map.remove("FR");
		System.out.println("FR�������"+map.containsKey("FR"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
	}

}
