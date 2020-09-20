package internalclass;

import org.omg.CORBA.PUBLIC_MEMBER;

public class External {

	private String  name;
	
	//��Ա�ڲ��ඨ��ʵ��
	public class Internal{
		public void print() {
			System.out.println("����External�ڲ�����ĳ�Ա�ڲ���Ĵ�ӡ");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public External() {
		
	}

	public External(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		//�ֲ��ڲ��ڵ�localInternalClass�Ķ���ּ��show������Ч�����濴��������
		class localInternalClass{
			public void localprint() {
				System.out.println("���Է����ڲ��ľֲ��ڲ���Ĵ�ӡ");
			}
		}
		localInternalClass loc = new localInternalClass();
		loc.localprint();
	}
	
	public static class StaticInternalClass {
		public void print() {
			System.out.println("����External�ڲ������Ա�ľ�̬�ڲ���Ĵ�ӡ");
		}
		
	}
}
