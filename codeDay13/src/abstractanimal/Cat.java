package abstractanimal;

public class Cat extends Animal{

	public Cat() {
		super(7);
		System.out.println("Cat class has been Created. ");
	}
	
	public void eat() {
		System.out.println("Cat can also eat");
	}
	public void meow() {
		System.out.println("Yes!!! I can shout like a meowwwwwww!!!");
	}
	
	public void sleep() {
		System.out.println("Cat is sleeping!!");
	}
	public void prance() {
		System.out.println("Hey!!! Can you walk like this.... :P. Yeah i am prancing");
	}
}
