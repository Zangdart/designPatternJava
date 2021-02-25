package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	int price;
	String name;
	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		//show the price of the components inside the component
		for(Component c : components) {
			c.showPrice();
		}
	}

}
