package com.yash.library.helper;

import java.util.List;

import com.yash.library.books.GetBooks;
import com.yash.library.books.ShowBooks;
import com.yash.library.ifactory.iBookCategory;
import com.yash.library.model.Book;

public class RomanticBookHelper implements iBookCategory {

	@Override
	public Book getBookNames(int id) {
		ShowBooks.showRomanticBookList();
		return GetBooks.getRomanticBook(id);
	}

}
