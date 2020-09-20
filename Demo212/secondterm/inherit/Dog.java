package inherit;

public class Dog extends Pet {
	
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Dog(){
           
		System.out.println("����Dog���޲ι��췽��");
		
	}

	public Dog(String name,int health,int love, String strain){
		//this.name=name; //����ֱ�ӷ��ʸ����private����
/*		System.out.println("����Dog���вι��췽��");
		super.setName(name);//����ͨ�������public��setter���������ʸ��������
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//���������Ĵ�����Դﵽͬ����Ч��
		this.strain=strain;	
		
	}
	
	public void print() {
		super.print();
		/*System.out.println("����:"+this.name);
    	System.out.println("����ָ��:"+this.health);
    	System.out.println("�ɰ�ָ��:"+this.love);*/
		System.out.println("Ʒ�֣�"+strain);
	}
	
	public void eatSomrthing(String food) {
		System.out.println(this.getName()+"���ڳ�"+food);
		if(this.getHealth()!=100){
			
			   this.setHealth(this.getHealth()+3<=100?this.getHealth()+3:100);
			   System.out.println(this.getName()+"����"+food);
	    }
		else {
				  System.out.println(this.getName()+"�Ѿ����ˣ��Ժ���ι");
			  }
	}
	
	public void catchingFlyDisc() {
		if(this.getHealth()>10) {
			System.out.println(this.getName()+"������һ����ˣ");
			this.setHealth(this.getHealth()-10);
			this.setLove(this.getLove()+5);
		}else {
			System.out.println(this.getName()+"����,��������Ϸ��ֻ��й�ͷ");
		}
	}
	
	public int getLegs() {
		return 4;
	}
	
	public boolean equals(Object obj) {
		//�Ƚϵ���this�����obj�����Ƿ���ͬһ������ʵ��
		if(obj instanceof Dog) {
			Dog dog=(Dog)obj;
			if(this.getName().equals(dog.getName())&&this.getStrain().equals(getStrain())) {
				return true;
			}
		}else {
			return false;
		}
		    return false;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ҽ�"+this.getName()+"��һ��"+this.strain;
	}
		
		
}

