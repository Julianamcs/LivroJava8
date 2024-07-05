/**
 * 
 */
package classes;

/**
 * 
 */
public class VehicleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle miniVan = new Vehicle();
		Vehicle sportCar = new Vehicle();
		
		double gallons;
		int dist = 252;
		
		//Atribuindo valores dos campos da miniVan
		miniVan.passengers = 7;
		miniVan.fuelcap = 16;
		miniVan.mpg = 21;
		
		//Atribuindo valores dos campos do sportCar
		sportCar.passengers = 2;
		sportCar.fuelcap = 14;
		sportCar.mpg = 12;
		
		gallons = miniVan.fuelneeded(dist);
		System.out.println("miniVan can carry " + miniVan.passengers + " with range of " + miniVan.range() + " miles");
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportCar.fuelneeded(dist);
		System.out.println("sportCar can carry " + sportCar.passengers+ " with range of " + sportCar.range() + " miles");
		System.out.println("To go " + dist + " miles sportCar needs " + gallons + " gallons of fuel.");
	}

}
