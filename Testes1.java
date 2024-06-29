/*CORVERTER GALOES EM LITROS
 * 
 * o programa funcionará declarando duas variáveis double. Uma conterá o número de galões 
 * e a outra o número de litros após a conversão. Seja um galão equivalente a 3.7854 litros. 
 * Logo, na conversão de galões em litros, o valor do galõa é multiplicado por 3.7854. 
 * O programa exibe tanto o número de galões quanto o número equivalente a litros
 * */
public class Testes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons; //Contém o números de galões 
		double liters;  //Contém a conversão para litros
		
		gallons = 30; //galões são 10
		
		liters = gallons * 3.7854; //converter para litros
				
		System.out.println(gallons  +  " gallons is " + liters + " liters.");		
	}

}
