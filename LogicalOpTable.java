/*
 * tabela verdade para operadores lógicos*/
public class LogicalOpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		System.out.println("P\t Q\t AND\t OR\t XOR\t NOT");
		
		 p = true; q = true;
		 System.out.print(p + "\t " + q + "\t ");
		 System.out.print((p & q) + "\t " + (p|q) + "\t ");
		 System.out.print((p ^ q) + "\t " + (!p));
		 System.out.println("\n");
		 p = true; q = false;
		 System.out.print(p + "\t " + q + "\t ");
		 System.out.print((p & q) + "\t " + (p|q) + "\t ");
		 System.out.print((p ^ q) + "\t " + (!p));
		 System.out.println("\n");
		 p = false; q = true;
		 System.out.print(p + "\t " + q + "\t ");
		 System.out.print((p & q) + "\t " + (p|q) + "\t ");
		 System.out.print((p ^ q) + "\t " + (!p));
		 System.out.println("\n");
		 p = false; q = false;
		 System.out.print(p + "\t " + q + "\t ");
		 System.out.print((p & q) + "\t " + (p|q) + "\t ");
		 System.out.print((p ^ q) + "\t " + (!p));
	}

}
