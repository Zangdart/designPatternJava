package composite;

public class CompositeTest {

	public static void main(String[] args) {

		Component hd = new Leaf(150,"HDD");
		Component mouse = new Leaf(50, "Mouse");
		Component monitor = new Leaf(500, "Monitor");
		Component ram = new Leaf(100, "RAM");
		Component cpu = new Leaf(800, "CPU");

		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		
		//adding the components 
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(cabinet);
		computer.addComponent(ph);

		//testing
		
		ram.showPrice();//must be 100
		
		ph.showPrice();//550
		mb.showPrice();//900
		cabinet.showPrice();//1050
		
		computer.showPrice();//1600
	}

}
