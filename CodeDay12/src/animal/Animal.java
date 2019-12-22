package animal;

public class Animal {

	private int age;
	public Animal(int age) {
		this.age=age;
		System.out.println("Animal class has been created. ");
	}
	
	public void eat()
	{
		System.out.println("Yes! I know how to eat :P");
	}
	
	public int getAge() {
		return age;
	}
	public static void main(String ar[]) {
		
		Animal a=new Animal(10);
		Animal ad=new Dog();
		Animal ac=new Cat();
		//Dog d=new Animal(12);
		Dog d=new Dog();
		Cat c=new Cat();
		ad.eat();
		ac.eat();
		//ad.age;  Not initialize
		//ad.bowbow(); // Animal cant get access of its sub class
		d.bowbow();
		c.meow();
		System.out.println(d.getAge());
		
	}
}
