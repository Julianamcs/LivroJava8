/*CORVERTER GALOES EM LITROS
 * 
 * o programa funcionar� declarando duas vari�veis double. Uma conter� o n�mero de gal�es 
 * e a outra o n�mero de litros ap�s a convers�o. Seja um gal�o equivalente a 3.7854 litros. 
 * Logo, na convers�o de gal�es em litros, o valor do gal�a � multiplicado por 3.7854. 
 * O programa exibe tanto o n�mero de gal�es quanto o n�mero equivalente a litros
 * */
public class Testes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons; //Cont�m o n�meros de gal�es 
		double liters;  //Cont�m a convers�o para litros
		
		gallons = 30; //gal�es s�o 10
		
		liters = gallons * 3.7854; //converter para litros
				
		System.out.println(gallons  +  " gallons is " + liters + " liters.");		
	}

}
