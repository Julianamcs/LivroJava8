/**
 * Usando o laço FOR, a instrução IF e blocos de códigos para criar
 * uma versão melhorada do conversor de galões em litros desenvolvido no
 * primeiro teste. Essa nova versão exibirá uma tabela de conversçoes
 * começando com 1 galão e terminando com 100 galões. A cada 10 galões, uma linha 
 * em branco será exibida, Isso será feito com o uso de uam variável chamada counter
 * que onta o número de linhas que foram exibidas.*/
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
