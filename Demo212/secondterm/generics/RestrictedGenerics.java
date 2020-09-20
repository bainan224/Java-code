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
		
		//���͵�ͨ�����ÿ���ָ������ķ�������
		RestrictedGenerics<?> rg8 = null;
		rg8=rg;
		rg8=rg2;
		System.out.println(rg8);
		//������Ϊ���Ͳ������ɵķ��������ã�����ָ��������Ϊ���Ͳ������ɵķ�����ʵ��������֮��û�и��ӹ�ϵ
		rg3.function1(new GenericsMehtodGenerics<String>());
		rg3.function1(new GenericsMehtodGenerics<Date>());
		
		rg3.function1(new GenericsMehtodGenerics<Integer>());
		rg3.function1(new GenericsMehtodGenerics<Byte> ());
			
	}

}
