package codeDay1;

public class Car {

	int maxSpeed=25;
	int minSpeed=10;
	boolean isCarOn=false;
	char condition='A';
	double wieght =2016;
	
	void printVaraibles() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(isCarOn);
		System.out.println(condition);
		System.out.println(wieght);
	}
	
	// Here we defince getter and setter
	
	public int getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	public int getMinSpeed()
	{
		return this.getMinSpeed();
	}
	
	public double getWeight() {
		return wieght;
	}
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed=newMaxSpeed;
	}
	
	public void setMinSpeed(int newMinSpeed) {
		this.minSpeed=newMinSpeed;
	}
	void upgrageProperties()
	{
		minSpeed=maxSpeed;
		maxSpeed=maxSpeed+10;
	}
	public static void main(String ar[])
	{
		Car carry=new Car();
		carry.printVaraibles();
		System.out.println("These are kath new version upgrade");
		Car kath=carry;
		kath.upgrageProperties();
		kath.printVaraibles();
		
	}
}
