package DuoTai;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet cat1 =new Cat("�̰�",521,520);
		 Pet pgn1= new Penguin("�װ�", 90, 100,"��");  
		Master mst = new Master("����");
		   mst.feed(cat1, "С���");
		  Pet pet = mst.getPet("è��");
				  pet.print();
				  Pet pet1 = mst.getPet("���");
				  pet1.print();
	      mst.playWith(pet);
	     mst.playWith(pet1);
	}

}
