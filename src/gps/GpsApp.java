package gps;



public class GpsApp {
	
	/**
	 * This is the main method. It outputs the Latitude and Longitude 
	 * from GpsCoordinates, hard the location of Salt Lake City using
	 * the coordinate system in the GpsCoordinates class.
	 * It also outputs current location starting at SLC and gives three
	 * random updates using the Gps class
	 * 
	 */
	public static void main(String[] args) {
		
		// Sets the GpsCoordinates of Salt Lake City
		GpsCoordinates SaltLake = new GpsCoordinates(40.760671, -111.891122);
		//Gets my current location which happens to be Salt Lake City Coordinates
		Gps MyPosition = new Gps("Here Maps", SaltLake);
		
		//Outputs the Coords of Salt Lake City, my GPS' name and my position
		System.out.println("Gps coordinates of SLC: " + SaltLake);
		System.out.println("\nmyGps " + MyPosition + "\n");
		
		//Updates my position 3 times
		for(int i = 1; i <= 3; i++){
			MyPosition.updatePosition();
			System.out.println("position update" + i + ": " + MyPosition);		
		}
	}
	
	
	
	
}
