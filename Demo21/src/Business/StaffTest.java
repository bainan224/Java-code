package Business;

public class StaffTest {

	public static void main(String[] args) {
		Staff staff = new Staff("����",24,"Ů",4300);
		staff.printIncomebyMonth();
		AdministrativeAgent agent = new AdministrativeAgent("����",30,"��",4300,"�����ܼ�",3000);
		agent.printIncomebyMonth();
	    Manager manager = new Manager("Լ��",43,"��",4300,"�ܾ���",3600,50000,0.4);
	    manager.printIncomebyMonth();	
	    }

}
