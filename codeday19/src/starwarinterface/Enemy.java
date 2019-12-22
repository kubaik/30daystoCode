package starwarinterface;

public class Enemy implements Character {
	
	public String weapon="light";
	
	//signature must be same 
	public void attack() {
		System.out.println("The enemy atacks you!!");
	}
	public void heal() {
		System.out.println("the enemy heals himself");
	}
	
	public void weaponDraw() {
		System.out.println("Draw out weapon");
	}
	public String getWeapon() {
		return weapon;
	}
}
