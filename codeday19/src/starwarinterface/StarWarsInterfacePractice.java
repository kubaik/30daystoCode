package starwarinterface;

import java.util.Random;

public class StarWarsInterfacePractice {

	public static Character summinCharacter() {
		Random rand=new Random();
		if(Math.abs(rand.nextInt()) %2==0) {
			return new Enemy();
		}
		else {
			return new Hero();
		}
	}
	public static void main(String[] args) {
		
		Enemy darthVvader=new Enemy();
		Hero ObiWan =new Hero();
		
		darthVvader.attack();
		darthVvader.attack();
		ObiWan.attack();
		darthVvader.heal();
		ObiWan.heal();
		System.out.println("Enenmy weapon" + darthVvader.getWeapon());
		
		System.out.println("Hero weapon"+ObiWan.getWeapon());
	
		Character spy=summinCharacter();
		
		spy.attack();
		spy.heal();
	}
}
