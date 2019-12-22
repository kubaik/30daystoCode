package codeDay4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

	 int number;
	int max;
	Scanner sc=new Scanner(System.in);
	
	public GuessTheNumberGame(){
		 Random rand=new Random();
		 max=100;
		 number=Math.abs(rand.nextInt())%(max+1);
		 
	 }
	
	public void play()
	{
		while(true) {
			System.out.println("Enter your number ");
		int move=sc.nextInt();
		
		if(move>number)
			System.out.println("Select number is big");
		else if(move <number)
			System.out.println("number is too small ");
		else {
			System.out.println("YOU GOT IT BRO");
		break;
		}
		}
	}
	public static void guessTheNumber(int num)
	{
		if(num>=0 && num<=10)
			System.out.println("Number is pretty low");
		else if(num>=11 && num<=100)
			System.out.println("number is in good range");
		else 
			System.out.println("Number is out of range");
	}
	
	public static void main(String ar[])
	{
		guessTheNumber(0);
		guessTheNumber(10);
		guessTheNumber(11);
		guessTheNumber(100);
		guessTheNumber(-1);
		guessTheNumber(105);
		
		System.out.println("=====================");
		
		GuessTheNumberGame obj=new GuessTheNumberGame();
		obj.play();
	}
}
