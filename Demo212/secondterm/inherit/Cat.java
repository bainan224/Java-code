package inherit;

public class Cat extends Pet {
	
	public Cat() {
		
	}
	
	public Cat(String name,int Health,int Love) {
		super(name,Health,Love);
	}
	
	public void eatSomething(String food) {
		if(this.getHealth()!=100){
			
			   this.setHealth(this.getHealth()+4<=100?this.getHealth()+4:100);
			   System.out.println(this.getName()+"����"+food);
	    }
		else {
				  System.out.println(this.getName()+"�Ѿ����ˣ��Ժ���ι");
			  }
	}

	public void playing() {
		// TODO Auto-generated method stub
		if(this.getHealth()>60) {
			System.out.println(this.getName()+"���涺è����Ϸ");
			this.setHealth(this.getHealth()-3);
			this.setLove(this.getLove()+2);
		}else {
			System.out.println(this.getName()+"���������˯��");
		}
	}
	
	}
   

