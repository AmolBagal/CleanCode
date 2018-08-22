package com.yash.library.factory;

import com.yash.library.helper.CodingBookHelper;
import com.yash.library.helper.HorrorBookHelper;
import com.yash.library.helper.MySteryBookHelper;
import com.yash.library.helper.RomanticBookHelper;
import com.yash.library.ifactory.iBookCategory;

public class BookFactory {

	public static iBookCategory getInstance(String type) {
		String Type = type.toUpperCase();
		switch (Type) {
		case "CODING":
			return new CodingBookHelper();
		case "HORROR":
			return new HorrorBookHelper();
		case "MYSTERY":
			return new MySteryBookHelper();
		case "ROMANTIC":
			return new RomanticBookHelper();

		}
		return null;
	}
}
