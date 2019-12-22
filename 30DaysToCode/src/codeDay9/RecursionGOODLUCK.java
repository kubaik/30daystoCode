package codeDay9;

public class RecursionGOODLUCK {

	public static int summation(int n)
	{
		if(n<=0) // Base Case : When we stop the algorithm
			return 0;
		else // Recursive case: how many times we need to iterate the successful iteration
			// 5+summation(4)
			// 5+ 4 + summation(3)
			// 5+ 4 + 3 + summation(2)
			// 5 +4 +3 +2 + summation(1)
			// 5 + 4+3 +2 +1 =15
			return n+summation(n-1);
	}
	
	public static int factorial(int n) {
		if(n<=1) // base case
			return 1;
		else
			//factorial(4)= 4* factorial(3)
			//4*3*factorial(2)
			//4*3*2 *factorial(1)
			//4*3*2 +factorial(1)
			//4*3*2*1 =24
			return n*factorial(n-1);  // recursive case
	}
	 //5^3=5*5*5
	//5*5^2--> 5*5*5^1---> 5*5*5*5^0= 125
	public static int exponential(int n,int p) {
		// Base Case: 
		if(p<=0)
			return 1;
		else 	
			return n* exponential(n,p-1);
	}
	public static void main(String ar[])
	{
		System.out.println(summation(5));
		System.out.println(factorial(5));
		System.out.println(exponential(5,3));
	}
}
