package interfac;

public class AptitudeHandst extends Handset implements TheakePictures,Network{

	public  AptitudeHandst(String brand,String type) {
		// TODO Auto-generated constructor stub
		super(brand,type);
		System.out.println("------------------------");
		System.out.println("�ֻ�Ʒ�ƣ�"+this.getBrand()+ "    �ͺţ�"+this.getType());
	}
	
	
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ���ϳ���");
	}

	@Override
	public void takePictures() {
		// TODO Auto-generated method stub
		System.out.println("��������ͷ����");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("ͼƬ��Ϣ������...");	
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�Է���������Ƶͨ��");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("���ڻ�ȡ��Ϣ.....");
	}
   
}
