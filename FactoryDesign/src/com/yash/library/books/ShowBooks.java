package com.yash.library.books;

import java.util.ArrayList;

import com.yash.library.data.DataList;
import com.yash.library.model.Book;

public class ShowBooks {
	public static void showCodingBookList() {
		DataList.getCodingBookList()
				.forEach((book) -> System.out.println(book.getId() + " " + book.getBookName() + " " + book.getPrice()));
	}

	public static void showHorrorBookList() {
		DataList.getHorrorBookList()
				.forEach((book) -> System.out.println(book.getId() + " " + book.getBookName() + " " + book.getPrice()));
	}

	public static void showRomanticBookList() {
		DataList.getRomanticBookList()
				.forEach((book) -> System.out.println(book.getId() + " " + book.getBookName() + " " + book.getPrice()));
	}

	public static void showMysteryList() {
		DataList.getMysteryList()
				.forEach((book) -> System.out.println(book.getId() + " " + book.getBookName() + " " + book.getPrice()));

	}
}
