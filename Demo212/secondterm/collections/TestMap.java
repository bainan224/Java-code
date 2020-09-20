package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<TotalStudent, String> CommonClass = new HashMap<TotalStudent, String>();
		CommonClass.put(new TotalStudent(1, "����"), "��ͨ��");
		CommonClass.put(new TotalStudent(2, "���"), "��ͨ��");

		Map<TotalStudent, String> IntensiveClass = new HashMap<TotalStudent, String>();
		IntensiveClass.put(new TotalStudent(3, "�ȳ�"), "ǿ����");
		IntensiveClass.put(new TotalStudent(4, "�ƻ�"), "ǿ����");

		System.out.println("��ͨ�ࣺ");
		Set<Map.Entry<TotalStudent, String>> entries = CommonClass.entrySet();
		Iterator<Map.Entry<TotalStudent, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<TotalStudent, String> entry = iterator.next();
			System.out.println(entry);
		}

		System.out.println("\nǿ���ࣺ");
		Set<Map.Entry<TotalStudent, String>> entries2 = IntensiveClass.entrySet();
		Iterator<Map.Entry<TotalStudent, String>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<TotalStudent, String> entry2 = iterator2.next();
			System.out.println(entry2);
		}

	}

}
