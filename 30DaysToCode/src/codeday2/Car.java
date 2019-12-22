package codeday2;

public class Car {

	int maxSpeed=100;
	int minSpeed=10;
	boolean isCarOn=false;
	char condition='A';
	double wieght =2016;
	String carName="Kath";
	
	double maxfuel= 24;
	double currFuel=10;
	double massPerGallons=26.4;
	
	int numberOfMemberInCar=1;
	int maxCapacityInCar=6;
	public Car(int customMaxSpeed,double customWieght,int customInCar)
	{
		customMaxSpeed=maxSpeed;
		customWieght=wieght;
		customInCar=numberOfMemberInCar;
	}
	
	void printVaraibles() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(isCarOn);
		System.out.println(condition);
		System.out.println(wieght);
		System.out.println(numberOfMemberInCar);
	}
	
	void upgrageProperties()
	{
		minSpeed=maxSpeed;
		maxSpeed=maxSpeed+10;
	}
	
	public void getIn()
	{
		if(numberOfMemberInCar==maxCapacityInCar) {
			System.out.println("No space is vacant in the car");
		}
		else {
		numberOfMemberInCar++;
		System.out.println("one new member is added in car");
		}
	}
	
	public void getOut()
	{
		if(numberOfMemberInCar>0) {
		numberOfMemberInCar--;
		System.out.println("One member need to out of the car");
		}
		else
		{
			System.out.println("Driver is not present so car will not go for a ride");
		}
	}
	
	public double howManyMilesTillOutOfGas()
	{
		return currFuel*massPerGallons;
	}
	
	public double maxMilesPerFillUp()
	{
		return maxfuel*massPerGallons;
	}
	
	public void turnheCarOn()
	{
		if(!isCarOn)
		{
		isCarOn=true;
		System.out.println("Car is activated mode");
		}
		else
		{
			System.out.println("Car is already in activated mode");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("First present of bday");
		Car bdayPresent=new Car(10,3000.42,2);
		bdayPresent.printVaraibles(); 
		bdayPresent.getIn();
		bdayPresent.getIn();
		bdayPresent.getIn();
		bdayPresent.printVaraibles();
		
		
		System.out.println("Miles left"+bdayPresent.howManyMilesTillOutOfGas());
		System.out.println("Max Miles"+bdayPresent.maxMilesPerFillUp());
		System.out.println("second bday present");
		bdayPresent.getOut();
		bdayPresent.printVaraibles();
		
		
		System.out.println("=========================================");
		
		bdayPresent.getIn();
		bdayPresent.getIn();
		bdayPresent.getIn();
		bdayPresent.getIn();
		bdayPresent.getIn();
		
		bdayPresent.getOut();bdayPresent.getOut();bdayPresent.getOut();bdayPresent.getOut();bdayPresent.getOut();bdayPresent.getOut();
		bdayPresent.getOut();
		
	}
}
