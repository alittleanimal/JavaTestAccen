package test1103;

public class Hero implements Comparable<Hero>{

	public String name;
	public float hp;
	public int damage;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}



	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]"+"\n";
	}


	@Override
	public int compareTo(Hero anotherHero) {
		if (damage<anotherHero.damage) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public boolean matched() {
		return this.hp>100 && this.damage<50;
	}
}
