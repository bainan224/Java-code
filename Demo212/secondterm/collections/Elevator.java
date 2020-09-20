package collections;

import java.util.LinkedList;

public class Elevator<P> {
    private LinkedList<P> list = new LinkedList<P>();
    
    public void In(P p) {
		this.list.addLast(p);
	}

	public P Out() {
		return this.list.removeFirst();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		System.out.println("��ǰ����������죺\n");
		for(P p:list) {
			str+="�˿�"+p.toString()+"\n";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator<Penguin> peg = new Elevator<>();
		peg.In(new Penguin("����", "��", 5));
		peg.In(new Penguin("ѩ��", "��", 6));
		System.out.println(peg);
		
		System.out.println("����ͣ��һ¥,������һֻ���");
		peg.In(new Penguin("��֭", "Ů", 8));
		System.out.println(peg);
		
		System.out.println("����up�� �� �� �� �� �� ��");
		System.out.println(peg.Out()+"\n������ѵ���12¥���߳�����");
		System.out.println("----------------");
		System.out.println(peg);
	
	}

}
