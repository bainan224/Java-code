package interfac;

public class HandsetTest {
	public static void main(String []args) {
		 
		 AptitudeHandst apt = new AptitudeHandst("SAMSUNG","GalaxyS7edge");
		 apt.info();
		 apt.networkConn();
		 apt.call();
		 apt.sendInfo();
		 apt.takePictures();
		 
		 CommonHandset com = new CommonHandset("ŵ����", "����270");
		 com.info();
		 com.play("�����ۡ�");
		 com.call();
		 com.sendInfo();
		 
		
	}

}
