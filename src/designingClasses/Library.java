package designingClasses;

import java.util.ArrayList;

public class Library {
	
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Library() {
		
		name = "Brookfield Library";
		books.add(new Book("AP Java for Dummies", 2));
		books.add(new Book("The Pollitically Incorrect Guide to American History", 300));
		books.add(new Book("The Prince", 500));
		books.add(new Book("Introduction to Data Structures", 320));
		books.add(new Book("Advanced Data Structures", 380));
		books.add(new Book("MULTITHREADING!!!", 1000));
		books.add(new Book("Ecci Romani", 100));
		books.add(new Book("On the Dignity of C++", 0));
		books.add(new Book("The Lives of the most Excellent Comp. Sci. Teachers", 80));
		books.add(new Book("The Basics of Recursion in Java", 120));
		
	}
	
	public Library(String newName, ArrayList<Book> newBooks) {
		
		if(newName.length() > 0) {
			name = newName;
			books = newBooks;
		}
		
	}
	
	public boolean checkOutBook(Book toCheckOut) {
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).equals(toCheckOut)) {
				books.remove(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	public void returnBook(Book toReturn) {
		books.add(toReturn);
	}
	
	public void fire() {
		books.clear();
	}

}
