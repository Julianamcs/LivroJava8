/**
 * Usando o la�o FOR, a instru��o IF e blocos de c�digos para criar
 * uma vers�o melhorada do conversor de gal�es em litros desenvolvido no
 * primeiro teste. Essa nova vers�o exibir� uma tabela de convers�oes
 * come�ando com 1 gal�o e terminando com 100 gal�es. A cada 10 gal�es, uma linha 
 * em branco ser� exibida, Isso ser� feito com o uso de uam vari�vel chamada counter
 * que onta o n�mero de linhas que foram exibidas.*/
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons, liters;
		
		int counter;
		
		counter = 0;
		for(gallons = 1 ; gallons <= 100 ; gallons ++) {
			liters = gallons * 3.7854;
			System.out.println(gallons  +  " gallons is " + liters + " liters.");
			
			counter ++;
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
