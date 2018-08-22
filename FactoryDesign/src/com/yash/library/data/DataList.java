package com.yash.library.data;

import java.util.ArrayList;

import com.yash.library.model.Book;

public class DataList {
	public static ArrayList<Book> getCodingBookList() {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book(100, "Java", 550));
		list.add(new Book(200, "C++", 650));
		list.add(new Book(300, "C", 750));
		list.add(new Book(400, "VB", 850));
		return list;
	}

	public static ArrayList<Book> getHorrorBookList() {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(100, "Shirley", 1000));
		list.add(new Book(200, "Frank", 2000));
		list.add(new Book(300, "Stephen", 3000));
		list.add(new Book(400, "Ghost Story", 4000));

		return list;
	}

	public static ArrayList<Book> getRomanticBookList() {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(100, "Love Story", 123));
		list.add(new Book(456, "Pride", 432));
		list.add(new Book(797, "Me Before You", 968));
		list.add(new Book(753, "Fifty Shades", 354));
		return list;
	}

	public static ArrayList<Book> getMysteryList() {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(100, "Top 100", 123));
		list.add(new Book(456, "Murder", 432));
		list.add(new Book(797, "Dephne", 968));
		list.add(new Book(753, "Woods", 354));
		return list;
	}

}
