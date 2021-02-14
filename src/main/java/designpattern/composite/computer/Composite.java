package designpattern.composite.computer;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private String name;
	List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		components.forEach(component -> component.showPrice() );
	}

}
