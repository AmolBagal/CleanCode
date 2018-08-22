package com.yash.library.test;

import com.yash.library.factory.BookFactory;
import com.yash.library.model.Book;

public class BookTest {
	public static void launchFactory() {
		Book book = BookFactory.getInstance("HORROR").getBookNames(100);
		System.out.println(book.getId() + " " + book.getBookName() + " " + book.getPrice());
	}
}
