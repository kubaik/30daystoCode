package codeDay7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
	
	public static void printArray(int[] array)
	{
		System.out.print("[");
		for(int i=0;i<array.length;i++)
		{ int item=array[i];
			System.out.print(item);
			if(i<array.length-1)
			System.out.print(",");
		}
		System.out.println("]");
		
	}
	
	public static void main(String args[])
	{
		int[] ar3;
		int[] ar= {1,2,3,4};
		printArray(ar);
		int[] ar1=new int[3];
		String[] ar2= {"pooja","dooja","sooja"};
		
		 ar1[0]=11;
		 ar1[1]=12;
		 ar1[2]=13;
		System.out.println(Array.get(ar, 2));
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));
		Arrays.sort(ar);
		System.out.println(ar);
		
		for(String a:ar2)
			System.out.println(a);
	}
	
}
