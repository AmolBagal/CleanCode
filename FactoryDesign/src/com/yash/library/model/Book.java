package com.yash.library.model;

public class Book implements Comparable<Book> {
	private int id;
	private String bookName;
	private int price;

	public Book(int id, String bookName, int price) {
		this.id = id;
		this.bookName = bookName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean equals(Book book) {
		if (book == this)
			return true;

		if (book == null || book.getClass() != this.getClass())
			return false;
		Book bookObj = book;
		if (bookObj.id == id && bookObj.bookName.equals(bookName) && bookObj.price == price) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + bookName.hashCode();
		result = 31 * result + price;

		return result;
	}

	@Override
	public int compareTo(Book book) {
		if (book.id == id)
			return 0;
		else if (id > book.id)
			return 1;
		else
			return -1;
	}
}
