package exceptionhandling;

public class ExceptionPractice {

	public static void main(String[] args) {
		try {
			int[] c= new int[6];
			System.out.println("Element 6 at index 5= "+c[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown" +e);
		}
		finally {
			System.out.println("Finally Finished try catch");
		}
		}
	}

