package default_;

public abstract class Library_Item {
	private String title;
	private String publisher;
	private int year;
	
	public Library_Item(String title, String publisher, int year) { 
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Library_Item(String publisher) { 
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	
	public int getYear() {
		return this.year;
	}
	
	
	
	public abstract void displayDetails();
	
	public boolean isPublishedBefore(int checkYear) {
		return this.year < checkYear;
	}

}
