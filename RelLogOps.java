/*
 * demonstra os operadores relacionais e lógicos*/
public class RelLogOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10, j = 11;
		boolean b1 = true, b2 = false;
		
		if(i < j)
			System.out.println("i < j");
		if(i <= j)
			System.out.println("i <= j");
		if(i != j)
			System.out.println("i != j");
		if(i == j)
			System.out.println("this won´t execute");
		if(i >= j)
			System.out.println("this won´t execute");
		if(i > j)
			System.out.println("this won´t execute");
		
		if(b1 & b2)
			System.out.println("this won´t execute");
		if(!(b1 & b2))
			System.out.println("!(b1 & b2) is true");
		if(b1 | b2)
			System.out.println("b1 | b2 is true");
		if(b1 ^ b2)
			System.out.println("b1 ^ b2 is true");
	}

}
