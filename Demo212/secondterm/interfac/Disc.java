package interfac;

public class Disc implements USB {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入移动硬盘");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("移动硬盘连接成功！");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("已安全移除移动硬盘");
	}

}
