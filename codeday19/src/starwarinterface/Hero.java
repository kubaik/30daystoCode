package starwarinterface;

public class Hero implements Character{
	public String weapon="The Force";
	public void attack() {
		System.out.println("The hero attack on enemy");
	}

	public void heal() {
		System.out.println("the hero heals you!!");
	}
	
	public String getWeapon() {
		return weapon;
	}
}
