package abstractanimal;

public abstract class Animal {

	private int age;
	public Animal(int age) {
		this.age=age;
		System.out.println("Animal class has been created. ");
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Animal is sleeping ");
	}
	public int getAge() {
		return age;
	}
	public static void main(String ar[]) {
		
	
		Animal ad=new Dog();
		Animal ac=new Cat();
		//Dog d=new Animal(12);
		Dog d=new Dog();
		d.sleep();
		Cat c=new Cat();
		c.sleep();
		ad.eat();
		ac.eat();
		//ad.age;  Not initialize
		//ad.bowbow(); // Animal cant get access of its sub class
		d.bowbow();
		c.meow();
		System.out.println(d.getAge());
		
		//Casting 
		
		Object dog=new Dog();
		Dog realDog=(Dog)dog;
		realDog.run();
		
		Object str="pooja";
		String real=(String) str;
		real.chars();
		
		//what happens when
		
		Dog doggy=new Dog();
		if(doggy instanceof Animal) {
			Animal animal=(Animal) doggy;
			animal.sleep();
		}
		doggy.sleep();
		
		
	}
}
