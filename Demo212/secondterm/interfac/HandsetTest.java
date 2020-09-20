package interfac;

public class HandsetTest {
	public static void main(String []args) {
		 
		 AptitudeHandst apt = new AptitudeHandst("SAMSUNG","GalaxyS7edge");
		 apt.info();
		 apt.networkConn();
		 apt.call();
		 apt.sendInfo();
		 apt.takePictures();
		 
		 CommonHandset com = new CommonHandset("Åµ»ùÑÇ", "·­¸Ç270");
		 com.info();
		 com.play("¡¶±©¿Û¡·");
		 com.call();
		 com.sendInfo();
		 
		
	}

}
