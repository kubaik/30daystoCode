package abstractanimal;

public class Dog extends Animal{

	public Dog() {
		super(15);
		System.out.println("Dog class has been Created. ");
	}
	public void sleep() {
		System.out.println("DOg is sleeping");
	}
	public void eat() {
		System.out.println("DOG can eat");
	}
	public void bowbow() {
		System.out.println("Yes!! I KNOW how to do bow bow can you?");
	}
	public void run() {
		System.out.println("hey see i am running huhaaaaaa!!!");
	}
}
