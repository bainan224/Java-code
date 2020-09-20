package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<>();
		map.put("01", new Student("����", "Ů", 19));
		map.put("02", new Student("���", "Ů", 18));
		map.put("03", new Student("�ȳ�", "��", 20));
		map.put("04", new Student("�ƻ�", "��", 17));

		System.out.println("����01��ѧ����Ϣ��\n" + map.get("01"));
		System.out.println("\n�Ƿ����08��ѧ����" + map.containsKey("08"));

		System.out.println("------------------------");

		Set<Map.Entry<String, Student>> entries = map.entrySet();

		Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Student> entry = iterator.next();

			System.out.println("ѧ�ţ�" + entry.getKey() + "\t\tѧ����Ϣ��" + entry.getValue());
		}

	}

}
