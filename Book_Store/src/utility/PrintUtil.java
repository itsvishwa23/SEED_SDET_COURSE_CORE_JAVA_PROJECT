package utility;

import java.util.List;

import library.Book;

public class PrintUtil extends StoreUtil {

	public PrintUtil(StoreUtil storeUtil) {
		storeUtil = storeUtil;
	}

	public void get_no_of_book() {
		System.out.println(Book.book_count);
	}

	public void print_details() {
		System.out.println("The List of the Books is as follows:");
		List<Book> books = getBookList();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
