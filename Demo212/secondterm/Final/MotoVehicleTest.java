package Final;

import java.util.Scanner;

public class MotoVehicleTest {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("��������Ҫ�⳵�����ͣ�1���γ���2.�ͳ�");
		int cartype=scan.nextInt();
		if(cartype==1) {
			//���������γ���Ʒ�ƺ��ͺ�
			String brand ="���";
			String type = "������";
			//����������⳵������
			int days = 10;
			RentedCar rcar=new RentedCar(brand ,type);
			int rentfee = rcar.calcRent(10);
			System.out.println("Ʒ�ƣ�"+rcar.getBrand());
			System.out.println("�ͺţ�"+rcar.getType());
			System.out.println("�⳵������"+days);
			System.out.println("�����Ϊ��"+rentfee);
		}else {
			//�����ǿͳ���Ϣ�������Լ��ͳ�����Ĵ������ͳ����ļ���
		}
	}

}
