package interfac;

public class AptitudeHandst extends Handset implements TheakePictures,Network{

	public  AptitudeHandst(String brand,String type) {
		// TODO Auto-generated constructor stub
		super(brand,type);
		System.out.println("------------------------");
		System.out.println("手机品牌："+this.getBrand()+ "    型号："+this.getType());
	}
	
	
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("开始网上冲浪");
	}

	@Override
	public void takePictures() {
		// TODO Auto-generated method stub
		System.out.println("开启摄像头拍照");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("图片信息发送中...");	
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("对方邀请你视频通话");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("正在获取信息.....");
	}
   
}
