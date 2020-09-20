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
			System.out.println("性别：" + this.sex);
		}
		
		public void swim() {
			if(this.getHealth()>60) {
		
			System.out.println(this.getName()+"和主人欢快的游泳");
			this.setHealth(this.getHealth()-3);
			this.setLove(this.getLove()+2);
		}
	}
	
	}


