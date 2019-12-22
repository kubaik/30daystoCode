package librarycatalogue;

public class Book {
	// Properties,fields, global variable
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckOut;
	int dayCheckOut=-1;
	
	// constructor
	public Book(String bookTitle,int bookPageCount,int bookISBN) {
		this.title=bookTitle;
		this.pageCount=bookPageCount;
		this.ISBN=bookISBN;
		isCheckOut=false;
		
	}
	
	//Instance methods
	//Getters
	
	public String getTitle()
	{
		return this.title;
	}
	public int getPageCount()
	{
		return pageCount;
	}
	
	public int getISBN() {
		return this.ISBN;
	}
	public boolean getIsCheckOut() {
		return isCheckOut;
	}
	
	public int getDayCheckOut() {
		return this.dayCheckOut;
	}
	
	// Setters :
	
	public void setIsCheckedOut(boolean newIscheckedOut, int currentDayCheckedOut) {
		this.isCheckOut=newIscheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	public void setDayCheckedOut(int day) {
		this.dayCheckOut=day;
	}
	
}

