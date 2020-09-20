package collections;

import java.util.LinkedList;

public class Queue<T> {

	private LinkedList<T> list = new LinkedList<T>();

	public void In(T t) {
		this.list.addLast(t);
	}

	public T Out() {
		return this.list.removeFirst();

	}

	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String  str="";
		System.out.println("当前队列为：\n");
		for(T t:list) {
			str+="名字"+t.toString()+"\n";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Dog> dogque = new Queue<>();
        dogque.In(new Dog("旺仔", "柴犬", 3));
        dogque.In(new Dog("阿黄", "金毛", 6));
       
        System.out.println(dogque);
        System.out.println("队首为:"+dogque.Out()+"已被服务完，从队列中删除了");
        System.out.println("-------out一个后----------");
        System.out.println(dogque);
        
         dogque.In(new Dog("霸霸", "哈士奇", 5));
         System.out.println("-----in一个以后---------");
         System.out.println(dogque);
         
	}

}
