package utility;

import java.util.Comparator;

import library.Book;

public class CompareBookByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.price - o2.price;
	}

}
