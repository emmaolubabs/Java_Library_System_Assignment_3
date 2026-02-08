package default_;

import java.util.Random;

public class Magazine extends Library_Item {
private Random rand = new Random();
//Added the extra attributes needed for the Magazine class
private int issueNumber;
private String month;
	
	public Magazine(String title, String publisher, int year, int issueNumber, String month) {
		super(title, publisher, year);
		this.issueNumber = issueNumber;
		this.month = month;
	}
	// since the command is void I need to input what I would be passing out in the classes
	@Override
	public void displayDetails() {
		System.out.println("Magazine Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Year: " + getYear());
        System.out.println("IssueNumber: " + this.issueNumber);
        System.out.println("Month: " + month);
        System.out.println();
	}

}
