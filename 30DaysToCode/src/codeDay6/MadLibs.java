package codeDay6;
import java.util.Scanner;
import java.util.Random;
public class MadLibs {

	Scanner sc=new Scanner(System.in);
	
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNums;
	Random rand=new Random();
	
	//Getters
	public String getStory()
	{
		return story;
	}
	
	public String getName() {
		return name;
		
	}
	public String getAdjective1() {
		return adjective1;
	}
	
	public String getAdjective2() {
		return adjective2;
	}
	public String getNoun1() {
		return noun1;
	}
	public String getNoun2() {
		return noun2;
	}
	public String getNoun3() {
		return noun3;
	}
	public String getAdverb() {
		return adverb;
	}
	public String getRandomNums()
	{
		return randomNums;
	}
	
	// Setters
	
	public void setStory(String newStory)
	{
		this.story=newStory;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	public void setAdjective1(String newAdjective1)
	{
		this.adjective1=newAdjective1;
	}
	
	public void setAdjective2(String newAdjective2)
	{
		this.adjective2=newAdjective2;
	}
	
	public void setNoun1(String newNoun1) {
		this.noun1=newNoun1;
	}
	public void setNoun2(String newNoun2) {
		this.noun2=newNoun2;
	}
	public void setNoun3(String newNoun3) {
		this.noun3=newNoun3;
	}
	
	public void setAdverb(String newAdverb) {
		this.adverb=newAdverb;
	}
	
	public void setRandomnNums(String newRandomNums)
	{
		int num=Math.abs(rand.nextInt())%100;
		int index=0;
		int[] numberHolder=new int[3];
		while(index<numberHolder.length) {
			numberHolder[index]=num+index;
			index++;
		}
		randomNums="not "+numberHolder[0]+" not "+numberHolder[1]+" 	but " +numberHolder[2];
	}
	
	public void printInstructions() {
		System.out.println("Welcome to the madlibs game. If you type in"
				+"words, we'll give you a story. Start by typing in a name.");
		
	}
	
	public void enterName() {
		setName(sc.nextLine());
		
	}
	public void enterNoun1()
	{
		System.out.println(" Hello dear please enter noun");
		setNoun1(sc.nextLine());
	}
	public void enterNoun2()
	{
		System.out.println("can you please enter a noun");
		setNoun2(sc.nextLine());
	}
	public void enterNoun3()
	{
		System.out.println("oopss i need another noun please");
		setNoun3(sc.nextLine());
	}
	
	public void enterAdjective1()
	{ System.out.println("I need mangoes oopss no no just need adjective");
		setAdjective1(sc.nextLine());
		
	}
	public void enterAdjective2()
	{
		System.out.println(" Now no mangoes need banana oopss kidding one another adjective please");
		setAdjective2(sc.nextLine());
		
	}
	
	public void enterAdverb()
	{
		System.out.print("please enter a adverb");
		setAdverb(sc.nextLine());
	}
	public void putTogetherTheStory() {
		String story="Jesse and here best friend "+getName()+ "went to disney world today"
				+" They saw a"+ getNoun1()+"in a show at the magin Kingdom"
				+"and rare a"+ getAdjective1()+" feast for dinner.The next day I"
				+" ran"+ getAdverb()+"to meet the Micky Mouse in his "+getNoun2()+ " "
				+" and then that night I gazed at the "+getRandomNums()+ " "+
				getAdjective2()+ " fireworks shooting from the "+getNoun3() +" .";
		setStory(story);
	}
	
	public void play()
	{
		enterName();
		enterNoun1();
		enterAdjective1();
		enterAdverb();
		enterNoun2();
		enterAdjective2();
		enterNoun3();
		putTogetherTheStory();
		System.out.println(getStory());
	}
	
	public static void main(String ar[])
	{
		MadLibs obj=new MadLibs();
		obj.printInstructions();
		obj.play();
	}
}

