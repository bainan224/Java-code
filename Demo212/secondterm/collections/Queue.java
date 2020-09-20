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
		System.out.println("��ǰ����Ϊ��\n");
		for(T t:list) {
			str+="����"+t.toString()+"\n";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Dog> dogque = new Queue<>();
        dogque.In(new Dog("����", "��Ȯ", 3));
        dogque.In(new Dog("����", "��ë", 6));
       
        System.out.println(dogque);
        System.out.println("����Ϊ:"+dogque.Out()+"�ѱ������꣬�Ӷ�����ɾ����");
        System.out.println("-------outһ����----------");
        System.out.println(dogque);
        
         dogque.In(new Dog("�԰�", "��ʿ��", 5));
         System.out.println("-----inһ���Ժ�---------");
         System.out.println(dogque);
         
	}

}
