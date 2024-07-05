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

	//esse � o construtor para Vehicle
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

}
