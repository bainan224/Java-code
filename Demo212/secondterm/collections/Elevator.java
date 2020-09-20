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
		System.out.println("当前电梯内有企鹅：\n");
		for(P p:list) {
			str+="乘客"+p.toString()+"\n";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator<Penguin> peg = new Elevator<>();
		peg.In(new Penguin("可乐", "男", 5));
		peg.In(new Penguin("雪碧", "男", 6));
		System.out.println(peg);
		
		System.out.println("电梯停在一楼,进来了一只企鹅");
		peg.In(new Penguin("橙汁", "女", 8));
		System.out.println(peg);
		
		System.out.println("电梯up中 ↑ ↑ ↑ ↑ ↑ ↑");
		System.out.println(peg.Out()+"\n该企鹅已到达12楼，走出电梯");
		System.out.println("----------------");
		System.out.println(peg);
	
	}

}
