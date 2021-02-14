package designpattern.composite.computer;

public class Leaf implements Component {

	private int price;
	private String name;
	
	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void showPrice() {
		System.out.println(name + ": " + price);
	}

}
