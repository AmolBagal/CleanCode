package com.yash.library.books;

import com.yash.library.data.DataList;
import com.yash.library.model.Book;

public class GetBooks {
	public static Book getshowCodingBook(int id) {
		System.out.println("Selected Book");
		return DataList.getCodingBookList().stream().filter((p) -> p.getId() == id).findAny().orElse(null);
	}

	public static Book getHorrorBook(int id) {
		return DataList.getHorrorBookList().stream().filter((p) -> p.getId() == id).findAny().orElse(null);
	}

	public static Book getRomanticBook(int id) {
		return DataList.getRomanticBookList().stream().filter((p) -> p.getId() == id).findAny().orElse(null);
	}

	public static Book getMysteryBook(int id) {
		return DataList.getMysteryList().stream().filter((p) -> p.getId() == id).findAny().orElse(null);
	}
}
