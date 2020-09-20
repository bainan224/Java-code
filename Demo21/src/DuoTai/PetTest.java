package DuoTai;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet cat1 =new Cat("ÄÌ°ü",521,520);
		 Pet pgn1= new Penguin("°×°×", 90, 100,"´Æ");  
		Master mst = new Master("÷ìÀö");
		   mst.feed(cat1, "Ğ¡Óã¸É");
		  Pet pet = mst.getPet("Ã¨ßä");
				  pet.print();
				  Pet pet1 = mst.getPet("Æó¶ì");
				  pet1.print();
	      mst.playWith(pet);
	     mst.playWith(pet1);
	}

}
