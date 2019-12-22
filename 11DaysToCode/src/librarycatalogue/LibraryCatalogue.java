package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
	//properties/fields/ Global Variables
	Map<String,Book> bookCollection=new HashMap<String, Book>();
	int currentDay=0;
	int bookTimePeriod=7;
	double intialLateFee=50;
	double feePerLateDay=100;
	
	//Constructors
	
	public LibraryCatalogue(Map<String, Book> collection)
	{
		this.bookCollection=collection;
	}
	public LibraryCatalogue(Map<String,Book> collection,int newBookTimePeriod,
			double newInitialLateFee, double newFeePerLateDay) {
		this.bookCollection=collection;
		this.bookTimePeriod=newBookTimePeriod;
		this.intialLateFee=newInitialLateFee;
		this.feePerLateDay=newFeePerLateDay;
		
	}
	
	// getters
	public int getCurrentDay() {
		return currentDay;
	}
	
	public Map<String,Book> getBookCollection()
	{
		return bookCollection;
	}
	
	public Book getBook(String bookTitle){
		return getBookCollection().get(bookTitle);
	}
	public int getBookTimePeriod() {
		
		
		return bookTimePeriod;
	}
	
	public double getInitialLateFee() {
		return intialLateFee;
	}
	
	public double getFeePerLateDay() {
		return feePerLateDay;
	}
	
	//Setters:
	
	public void setCurrentDay(int newCurrentDay) {
		this.currentDay=newCurrentDay;
	}
	
	public void nextDay() {
		currentDay++;
	}
	
	public void setDay(int day) {
		currentDay=day;
	}
	
	//Instance Methods
	
	public void CheckOut(String title) {
		Book book=getBook(title);
		if(book.getIsCheckOut()) {
			sorryBookALreadyCHeckedOut(book);
		}
		else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("you just checked out "  + title +". It is due on day"
			+ (getCurrentDay()+getBookTimePeriod())+ ".");
		}
	}
	
	public void returnBook(String title) {
	Book  book=getBook(title);
	int daysLate=currentDay- (book.getDayCheckOut()+ getBookTimePeriod());
	if(daysLate>0) {
		System.out.println("You owe the Library rs"+ (getInitialLateFee()+daysLate*getFeePerLateDay())+
				"BECAUSe YOUr BOOK IS "+daysLate+ "days over due");
	}
	else{
			System.out.println("book Returned. Thank you !!");
		}
	book.setIsCheckedOut(false, -1);
	}
	
	
	public void sorryBookALreadyCHeckedOut(Book book) {
		System.out.println("Sorry, "+book.getTitle()+ "is already checked out."
				+"It should be back on day"+(book.getDayCheckOut()+ getBookTimePeriod()+ "."));
	}
	public static void main(String[] args) {
		
		Map<String,Book> bookCollection=new HashMap<String, Book>();
		
		Book harry=new Book("Harry Potter", 485,9999);
		bookCollection.put("Harry Potter",harry);
		
		LibraryCatalogue lib=new LibraryCatalogue(bookCollection);
		
		lib.CheckOut("Harry Potter");
				lib.nextDay();
				lib.nextDay();
				lib.nextDay();
				lib.nextDay();
				lib.nextDay();
				lib.nextDay();
				lib.CheckOut("Harry Potter");
				lib.setDay(17);
				lib.returnBook("Harry Potter");
				lib.CheckOut("Harry Potter");
	}
}
