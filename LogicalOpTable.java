/*
 * tabela verdade para operadores lógicos*/
public class LogicalOpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		System.out.println("P/t Q/t AND/t OR/t XOR/t NOT");
		
		 p = true; q = true;
		 System.out.println(p + "/t " + q + "/t ");
		 System.out.println((p & q) + "/t " + (p|q) + "/t ");
		 System.out.println((p ^ q) + "/t " + (!p));
		 
		 p = true; q = false;
		 System.out.println(p + "/t " + q + "/t ");
		 System.out.println((p & q) + "/t " + (p|q) + "/t ");
		 System.out.println((p ^ q) + "/t " + (!p));
		 
		 p = false; q = true;
		 System.out.println(p + "/t " + q + "/t ");
		 System.out.println((p & q) + "/t " + (p|q) + "/t ");
		 System.out.println((p ^ q) + "/t " + (!p));
		 
		 p = false; q = false;
		 System.out.println(p + "/t " + q + "/t ");
		 System.out.println((p & q) + "/t " + (p|q) + "/t ");
		 System.out.println((p ^ q) + "/t " + (!p));
	}

}
