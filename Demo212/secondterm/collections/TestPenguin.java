package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPenguin {
	public static void main(String[]args) {
		List<Penguin> pList = new ArrayList<>();
		Penguin peg1 =new Penguin("可乐", "男", 5);
		Penguin peg2 =new Penguin("雪碧", "男", 6);
		Penguin peg3 =new Penguin("橙汁", "女", 8);
		Penguin peg4 =new Penguin("奶茶", "女", 2);
		
		pList.add(peg1);
		pList.add(peg2);
		pList.add(peg3);
		pList.add(peg4);
		
	    System.out.println("企鹅数量："+pList.size());
	
		Iterator<Penguin> iterator = pList.iterator();
		while (iterator.hasNext()) {
			Penguin pgetemp = iterator.next();
			System.out.println(pgetemp);
		}
		
		System.out.println("-----------------");
		if(pList.contains(peg1)) {
			pList.remove(peg1);
			System.out.println("可乐已经在list中，我已将其删掉");
		}else {
			System.out.println("可乐不在list中");
		}
		
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i));
		}
		
	}

}
