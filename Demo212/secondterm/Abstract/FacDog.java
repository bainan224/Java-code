package Abstract;

public class FacDog extends AbsPet{
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public FacDog(){
           
		System.out.println("����Dog���޲ι��췽��");
		
	}

	public FacDog(String name,int health,int love, String strain){
		//this.name=name; //����ֱ�ӷ��ʸ����private����
/*		System.out.println("����Dog���вι��췽��");
		super.setName(name);//����ͨ�������public��setter���������ʸ��������
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//���������Ĵ�����Դﵽͬ����Ч��
		this.strain=strain;	
		
	}
	
	public  void print() {
		
		System.out.println("����:"+this.getName());
    	System.out.println("����ָ��:"+this.getHealth());
    	System.out.println("�ɰ�ָ��:"+this.getLove());
		System.out.println("Ʒ�֣�"+strain);
	}
	
	public  void eatSomething(String food){
		System.out.println(this.getName()+"ϲ���Թ���");
	}
	
	public  int GetLegs() {
		return 4;
	}

}

