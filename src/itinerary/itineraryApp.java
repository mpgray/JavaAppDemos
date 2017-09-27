package itinerary;

import java.util.ArrayList;


public class itineraryApp {

	public static void main(String[] args) {
		ArrayList<String> itinerary = new ArrayList<String>();
		String travelRoute = "";
		StringBuilder sb = new StringBuilder();
		
		itinerary.add("London");
		itinerary.add("Paris");
		itinerary.add("Rome");
		itinerary.add("done");
		
		for(String destination: itinerary){
			System.out.println("Destination: " + destination);
			if(!destination.equals("done")){ 
				if(sb.length() != 0) {
					sb.append(" to ");
				}
				sb.append(travelRoute.concat(destination.toUpperCase()));				
			}

		}
		
		System.out.println("trave route:");
		System.out.println(sb.toString());
	}

}
