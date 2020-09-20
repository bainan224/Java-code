package interfac;

public class CommonHandset extends Handset implements PlayWriting{
	
	 public CommonHandset(String brand,String type) {
		// TODO Auto-generated constructor stub
		super(brand,type);
		System.out.println("------------------------");
		System.out.println("手机品牌："+this.getBrand()+ "    型号："+this.getType());
	}

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("正在播放音乐"+song );
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("文字信息发送中...");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("正在通话中");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("正在获取信息....");
	}
	

}
