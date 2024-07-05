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

		Vehicle miniVan = new Vehicle(7, 16, 21);
		Vehicle sportCar = new Vehicle(2, 14, 12);
		
		double gallons;
		int dist = 252;
		
		
		gallons = miniVan.fuelneeded(dist);
		System.out.println("miniVan can carry " + miniVan.passengers + " with range of " + miniVan.range() + " miles");
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportCar.fuelneeded(dist);
		System.out.println("sportCar can carry " + sportCar.passengers+ " with range of " + sportCar.range() + " miles");
		System.out.println("To go " + dist + " miles sportCar needs " + gallons + " gallons of fuel.");
	}

}
