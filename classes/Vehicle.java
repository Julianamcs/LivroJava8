/**
 * 
 */
package classes;

/**
 * 
 */
public class Vehicle {

	int passengers; //número de passageiros
	int fuelcap; // capacidade de armazenamento de combustivel em galoes
	int mpg; //consumo de combustivel em milhas por galoes

	//esse é o construtor para Vehicle
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
