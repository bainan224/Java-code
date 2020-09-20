package interfac;

public class Upan implements USB {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入U盘");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("正在扫描U盘...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("已安全移出U盘");
	}

}
