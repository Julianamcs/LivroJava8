/**
 * 
 */
package controle;

/**
 * adivinha a letra do jogo
 */
public class Guess {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		char ch, ignore, answer = 'k';
		do {
			System.out.println("I´m thinkingn of a letter between A and Z.");
			System.out.print("Cant you guess it: ");
			
			ch = (char) System.in.read();
			
			//descartar qualquer outro caractere do buffer da entrada
			do {
				ignore = (char) System.in.read(); 
			}while(ignore != '\n');
			if(ch == answer) {
				System.out.println("**** Right ****");
			}else {
				System.out.println("....Sorry, you´re wrong.");
			}
			
			if(ch < answer) {
				System.out.println("too low");
			}else {
				System.out.println("too high");
				System.out.println("try again!\n");
			}
		}while(answer != ch);
		
		
	}

}
