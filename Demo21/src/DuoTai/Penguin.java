package DuoTai;

import DuoTai.Pet;

	public class Penguin extends Pet {
		private String sex;

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public Penguin() {

		}

		public Penguin(String name, int health, int love, String sex) {
			super(name, health, love);
			this.sex = sex;
			System.out.println("�Ա�" + this.sex);
		}
		
		public void swim() {
			if(this.getHealth()>60) {
		
			System.out.println(this.getName()+"�����˻������Ӿ");
			this.setHealth(this.getHealth()-3);
			this.setLove(this.getLove()+2);
		}
	}
	
	}


