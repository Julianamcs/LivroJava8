/**
 * Calcule quantas polegadas c�bicas h� em uma milha c�bica*/
public class PolegadasCubicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long ci;
		long im;
		
		im = 5280 * 12;
		ci = im * im * im;
		
		System.out.println("The are " +  ci  + " cubic inches in cubic miles.");
	}

}
