package internalclass;

import org.omg.CORBA.PUBLIC_MEMBER;

public class External {

	private String  name;
	
	//成员内部类定义实例
	public class Internal{
		public void print() {
			System.out.println("来自External内部定义的成员内部类的打印");
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
		//局部内部内的localInternalClass的定义旨在show里面有效，外面看看不到。
		class localInternalClass{
			public void localprint() {
				System.out.println("来自方法内部的局部内部类的打印");
			}
		}
		localInternalClass loc = new localInternalClass();
		loc.localprint();
	}
	
	public static class StaticInternalClass {
		public void print() {
			System.out.println("来自External内部定义成员的静态内部类的打印");
		}
		
	}
}
