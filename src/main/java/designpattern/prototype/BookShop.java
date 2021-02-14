package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;


import lombok.Data;

@Data
public class BookShop implements Cloneable {

	private String shopName;
	private List<Book> books = new ArrayList<>();
	
	@Override
	public BookShop clone() {
		BookShop bookShop = new BookShop();
		bookShop.setShopName(this.getShopName());
		for (Book b : this.getBooks()) {
			bookShop.getBooks().add(b);
		}
		
		return bookShop;
	}

	public void loadData() {
		for (int i = 1; i <= 10; i++) {
			Book book = new Book();
			book.setId(i);
			book.setName("Book " + i);
			books.add(book);
		}
	}
}
