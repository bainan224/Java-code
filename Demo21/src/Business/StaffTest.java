package Business;

public class StaffTest {

	public static void main(String[] args) {
		Staff staff = new Staff("黛丽",24,"女",4300);
		staff.printIncomebyMonth();
		AdministrativeAgent agent = new AdministrativeAgent("杰明",30,"男",4300,"艺术总监",3000);
		agent.printIncomebyMonth();
	    Manager manager = new Manager("约翰",43,"男",4300,"总经理",3600,50000,0.4);
	    manager.printIncomebyMonth();	
	    }

}
