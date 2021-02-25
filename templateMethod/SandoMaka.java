package templateMethod;

public class SandoMaka {

	public static void main(String[] args) {
		
		NikuSando nikumi = new NikuSando();
		nikumi.makeSando();
		
		System.out.println();
		
		FruitSando ichigo = new FruitSando();
		ichigo.makeSando();
		
	}

}
