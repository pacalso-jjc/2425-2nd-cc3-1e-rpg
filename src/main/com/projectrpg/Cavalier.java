public class Cavalier extends Classification{
	int hp;
	int damage;
	int armor;
	int initiative;
	
	public void Cavalier (int hp, int damage, int armor, int initiative) {
		this.hp = hp;
		this.damage = damage;
		this.armor = armor;
		this.initiative = initiative;
	}
	
	public int gethp() {return hp;}
	public void sethp(int hp) {this.hp = hp ;} 
	
	public int getdamage() {return damage;}
	public void setdamage(int damage) {this.damage = damage;}
	
	public int getarmor() {return armor;}
	public void setarmor(int armor) {this.armor = armor;}
	
	public int getinitiative() {return initiative;}
	public void setinitiative(int initiative) {this.initiative = initiative;}
	
	public void charge() {
		System.out.println("The cavalier charges with damage: "+damage);
	}
	public void pursue() {
		System.out.println("The cavalier pursues the enemy with initiative: "+ initiative);
	}
	
}
