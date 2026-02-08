package default_;

import java.util.Random;

public class Books extends Library_Item {
private Random rand = new Random();
 // Added the extra attributes needed for the Books class
private String author;
private int numPages;
	
	public Books(String title, String publisher, int year, String author, int numPages) {
		super(title, publisher, year);
		this.author = author;
		this.numPages = numPages;
	}
	// since the command is void I need to input what I would be passing out in the classes
	 @Override
	public void displayDetails() {
		
		        System.out.println("Book Details:");
		        System.out.println("Title: " + getTitle());
		        System.out.println("Publisher: " + getPublisher());
		        System.out.println("Year: " + getYear());
		        System.out.println("Author: " + this.author);
		        System.out.println("Number of Pages: " + numPages);
		        System.out.println();
		  
	}

}
