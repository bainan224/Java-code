package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<>();
		map.put("01", new Student("绿绿", "女", 19));
		map.put("02", new Student("红红", "女", 18));
		map.put("03", new Student("橙橙", "男", 20));
		map.put("04", new Student("黄黄", "男", 17));

		System.out.println("查找01号学生信息：\n" + map.get("01"));
		System.out.println("\n是否存在08号学生？" + map.containsKey("08"));

		System.out.println("------------------------");

		Set<Map.Entry<String, Student>> entries = map.entrySet();

		Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Student> entry = iterator.next();

			System.out.println("学号：" + entry.getKey() + "\t\t学生信息：" + entry.getValue());
		}

	}

}
