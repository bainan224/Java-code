package generics;

import java.sql.Date;

public class RestrictedGenerics <T extends Number>{
	
	private T price;
	
	public RestrictedGenerics(T price) {
		super();
		this.price = price;
	}
	public T getPrice() {
		return price;
	}
	public void setPrice(T price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.price.toString();
	}
	
	public void function1(GenericsMehtodGenerics<?> temp) {
		
	}
	
	public static void main(String[]args) {
		RestrictedGenerics<Integer> rg = new RestrictedGenerics<Integer>(12);
		System.out.println(rg);
		
		RestrictedGenerics<Double> rg2 = new RestrictedGenerics<Double>(12.35);
		System.out.println(rg2);
		
		RestrictedGenerics<Number> rg3 = new RestrictedGenerics<Number>(14);
		System.out.println(rg3);
		
		//泛型的通配引用可以指向任意的泛型类型
		RestrictedGenerics<?> rg8 = null;
		rg8=rg;
		rg8=rg2;
		System.out.println(rg8);
		//父类作为泛型参数生成的泛型类引用，不能指向子类作为泛型参数生成的泛型类实例，他们之间没有父子关系
		rg3.function1(new GenericsMehtodGenerics<String>());
		rg3.function1(new GenericsMehtodGenerics<Date>());
		
		rg3.function1(new GenericsMehtodGenerics<Integer>());
		rg3.function1(new GenericsMehtodGenerics<Byte> ());
			
	}

}
