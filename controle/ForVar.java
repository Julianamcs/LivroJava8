/**
 * 
 */
package controle;

/**
 * Declara a variável de controle de laço dentro do for
 */
public class ForVar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int fact = 1;
		//calcula o fatorial dos números até 5
		for(int i = 1; i <= 5 ; i++) {
			sum += i;
			fact *= i;
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}

}
