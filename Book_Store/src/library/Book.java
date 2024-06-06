package library;

import java.util.HashSet;
import java.util.Set;

public class Book {

	public static int book_count = 0;

	public int id;
	public String name;
	public int price;
	public Set<String> authors;

	public Book() {
		this.id = 1;
		this.name = "Default Book";
		this.price = 0;
		this.authors = new HashSet<>();
	}

	public Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.authors = new HashSet<>();
	}

	@Override
	public String toString() {
		return "The id of the book is " + id + ", The name of the book is: " + name + ", The price of the book is "
				+ price + ", The authors are: " + authors;
	}
}
