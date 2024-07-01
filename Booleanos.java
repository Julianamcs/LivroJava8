/*
 * dEmosntra os valores booleanos*/
public class Booleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		//o valor booleano pode controlar a interação if
		if(b) System.out.println("this is executed.");
		
		b=false;
		if(b) System.out.println("this is not executed");
		
		//o resultado de um operador relacional é o valor booleano
		System.out.println("10 > 9 is " + (10 > 9));
		
	}

}
