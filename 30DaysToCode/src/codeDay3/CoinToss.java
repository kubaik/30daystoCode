package codeDay3;

import java.util.Random;

public class CoinToss {

	public void coinToss()
	{
		Random num=new Random();
		int toss=Math.abs((num.nextInt())%2);
		if(toss==0)
		{
			System.out.println("Heads");
		}else
		System.out.println("Tails");
		
	}
	public static void main(String ar[])
	{
		CoinToss obj=new CoinToss();
		obj.coinToss();
		obj.coinToss();
		obj.coinToss();
		obj.coinToss();
		obj.coinToss();
		obj.coinToss();
	}
}
