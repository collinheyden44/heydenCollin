package designingClasses;

public class Book {
	
	private String title;
	private int pages;
	
	public Book() {
		title = "Java is the best";
		pages = 100;
	}
	
	public Book(String newTitle, int newPages) {
		
		if(newTitle.length() > 0) {
			title = newTitle;
		}
		
		if(newPages > 0) {
			pages = newPages;
		}
		
	}
	
	public String getTitle() {
		
		return title;
	
	}
	
	public int getPages() {
		
		return pages;
	
	}
	
	public String toString() {
		
		return "Book object: Title: " + title + " Pages: " + pages;

	}

	public boolean equals(Object otherObject) {
		
		if(this.toString().equals(otherObject.toString())) {
			
			return true;
		
		}
		
		return false;
		
	}
	
	public Object clone() {
		
		return new Book(title, pages);
		
	}

}
