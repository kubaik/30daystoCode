package exceptionhotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

	public static final double tooCold = 160;
	public static final double tooHot = 185;

	public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
		if (cocoaTemp >= tooHot) {
			throw new TooHotException();

		} else if (cocoaTemp <= tooCold) {
			throw new TooColdException();
		}
	}

	public static void main(String[] args) throws TooColdException, TooHotException, InterruptedException {
		double currentCocaTemp = 150;

		// This is the one method we can do in exception handling
		//NOTE : If we want to settle the cocoa temperature then we need to less the temp in hot case or increase the temp in cold case
		boolean wrongTemp=true;
		while(wrongTemp) {
		try {
			drinkHotChocolate(
					currentCocaTemp); /*
										 * // this line contains a exception if we used only throws error it will
										 * definatoly throw but we need to handle this code with exception handling
										 */
			System.out.println("Thays coca was good");
			wrongTemp=false;
		} catch (TooColdException e1) {
			System.out.println("Thats too cold!!!");
			currentCocaTemp =currentCocaTemp+5;
		}

		catch (TooHotException e2) {
			System.out.println("this is too hot");
			currentCocaTemp=currentCocaTemp -5;

		}
		TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("And sab badiya ");
	}
}
