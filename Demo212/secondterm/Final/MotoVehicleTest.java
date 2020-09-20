package Final;

import java.util.Scanner;

public class MotoVehicleTest {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入你要租车的类型：1，轿车，2.客车");
		int cartype=scan.nextInt();
		if(cartype==1) {
			//你继续输入轿车的品牌和型号
			String brand ="别克";
			String type = "林荫大道";
			//你继续输入租车的天数
			int days = 10;
			RentedCar rcar=new RentedCar(brand ,type);
			int rentfee = rcar.calcRent(10);
			System.out.println("品牌："+rcar.getBrand());
			System.out.println("型号："+rcar.getType());
			System.out.println("租车天数："+days);
			System.out.println("总租金为："+rentfee);
		}else {
			//后面是客车信息的输入以及客车对象的创建，客车租金的计算
		}
	}

}
