package default_;

import java.util.Random;

public class DVD extends Library_Item {
private Random rand = new Random();
//Added the extra attributes needed for the DVD class
private String director;
private int duration;
	
	public DVD(String title, String publisher, int year, String director, int duration) {
		super(title, publisher, year);
		this.director = director;
		this.duration = duration;
	}
	// since the command is void I need to input what I would be passing out in the classes
	@Override
	public void displayDetails() {
		System.out.println("DVD Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Year: " + getYear());
        System.out.println("Director: " + this.director);
        System.out.println("Duration: " + duration);
        System.out.println();
	}
}
