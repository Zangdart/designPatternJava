package decoratorPizza;

public class PizzaMaker {
public static void main(String[]args) {
	
	//TomatoSauce prend une Pizza dans son constructeur et Mozza aussi mais pas PlainPizza
	//On ajoute les toppings a la PlainPizza qui n'a rien dans son constructeur
	Pizza basicPizza = new TomatoSauce(new Mozza(new PlainPizza())); 
	
	System.out.println("Ingredients : " + basicPizza.getDescription());
	System.out.println("Price is : " + basicPizza.getCost());
	
//	Pizza no = new  PlainPizza();
//	System.out.println(no.getCost() + no.getDescription());
}
	
	
}
