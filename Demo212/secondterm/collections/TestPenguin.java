package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPenguin {
	public static void main(String[]args) {
		List<Penguin> pList = new ArrayList<>();
		Penguin peg1 =new Penguin("����", "��", 5);
		Penguin peg2 =new Penguin("ѩ��", "��", 6);
		Penguin peg3 =new Penguin("��֭", "Ů", 8);
		Penguin peg4 =new Penguin("�̲�", "Ů", 2);
		
		pList.add(peg1);
		pList.add(peg2);
		pList.add(peg3);
		pList.add(peg4);
		
	    System.out.println("���������"+pList.size());
	
		Iterator<Penguin> iterator = pList.iterator();
		while (iterator.hasNext()) {
			Penguin pgetemp = iterator.next();
			System.out.println(pgetemp);
		}
		
		System.out.println("-----------------");
		if(pList.contains(peg1)) {
			pList.remove(peg1);
			System.out.println("�����Ѿ���list�У����ѽ���ɾ��");
		}else {
			System.out.println("���ֲ���list��");
		}
		
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i));
		}
		
	}

}
