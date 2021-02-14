package designpattern.prototype;

/**
 * https://www.youtube.com/watch?v=nZ76x13Nm8Q
 * @author Andrea
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		System.out.println(bs.toString());
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("A1");
		bs1.getBooks().remove(1);
		System.out.println(bs1.toString());
	}

}
