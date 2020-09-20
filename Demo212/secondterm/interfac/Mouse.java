package interfac;

public class Mouse implements USB{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入鼠标");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("鼠标连接成功！");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("已禁止鼠标的使用");
	}

}
