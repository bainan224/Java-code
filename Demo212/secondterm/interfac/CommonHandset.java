package interfac;

public class CommonHandset extends Handset implements PlayWriting{
	
	 public CommonHandset(String brand,String type) {
		// TODO Auto-generated constructor stub
		super(brand,type);
		System.out.println("------------------------");
		System.out.println("�ֻ�Ʒ�ƣ�"+this.getBrand()+ "    �ͺţ�"+this.getType());
	}

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("���ڲ�������"+song );
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("������Ϣ������...");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("����ͨ����");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("���ڻ�ȡ��Ϣ....");
	}
	

}
