/**
 * 
 */
package classes;

/**
 * 
 */
public class Vehicle {

	int passengers; //n�mero de passageiros
	int fuelcap; // capacidade de armazenamento de combustivel em galoes
	int mpg; //consumo de combustivel em milhas por galoes


	int range() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

}
