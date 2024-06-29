/*
 * este programa ilustra sa diferenca,
 * 
 * entre um int e um double.
 * */
public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var; //essa instruçã declara uam variável int 
		double x; //essa instrução declara uam variável de pronto flutuante
		
		var = 10; //atribuiu a var o valor 10
		
		x = 10.0; // atribuiu a x o valor 10,0
		
		System.out.println("Original valor of var: " + var);
		System.out.println("Original valor of x: " + x);
		System.out.println(); //Exibi uma linha em branco
		
		//agora divide as duas por 4
		var = var / 4;
		x = x / 4;
		
		System.out.println("var after divisio: " + var);
		System.out.println("x after division: " + x);
		System.out.println(); //Exibi uma linha em branco
	}

}

