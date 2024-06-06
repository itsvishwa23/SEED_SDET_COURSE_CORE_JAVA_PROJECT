package utility;

import java.util.Comparator;

import library.Book;

public class CompareBookByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.name.compareTo(o2.name);
	}

}
