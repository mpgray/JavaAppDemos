package gps;

import java.util.Random;

public class Gps {
	private String name;
	private GpsCoordinates position;
	
	//This get the name of the GPS and your position
	public Gps(String n, GpsCoordinates pos){
		name = n;
		position = pos;
	}

	//this will update your position with a random number between -2.5 to 2.5
	public void updatePosition(){
		//get current position
		double currLong = position.getLongitude();
		double currLat = position.getLatitude();
		//create the random seed
		Random randCoord = new Random();
		
		//So this will make a 2 random numbers between -2.5 and 2.5
		double randLong = (randCoord.nextDouble() * 5 - 2.5);
		double randLat = (randCoord.nextDouble() * 5 - 2.5);

		//Adds current position to new random values
		currLat = currLat + randLat;
		currLong = currLong + randLong;
		
		//updates our new position
		position = new GpsCoordinates(currLat, currLong);
		position.setLatitude(currLat);
		position.setLongitude(currLong);
										
		
	}
	
	public GpsCoordinates getPosition(){
		return position;
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s", name, position);
	}
}
