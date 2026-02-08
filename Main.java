package default_;

public class Main {
	public static void main(String[] args) {
		Books b1 = new Books ("Sisters", "Halerquinn", 2006, "Danielle Steel", 520);
		Books b2 = new Books ("Geography of Climate Change", "Dales", 2004, "Emmanuel Babarinde", 1540);
		
		Magazine m1 = new Magazine ("Salzburger Vogue", "Stiegl", 2012, 110112,"January");
		Magazine m2 = new Magazine ("Vanity", "Vogue", 2005, 250905,"September");
		
		DVD disk1 = new DVD ("Game of thrones", "HBO", 2018, "Ryan Comdal", 100);
		
		b1.displayDetails();
		b2.displayDetails();
		m1.displayDetails();
		m2.displayDetails();
		
		disk1.displayDetails();
		
		boolean isOld = b1.isPublishedBefore(1999);
		System.out.print(b1.getTitle() + " is old " + isOld);
		
	}

}
