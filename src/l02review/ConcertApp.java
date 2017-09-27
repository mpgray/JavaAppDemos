package l02review;
public class ConcertApp { 

	public static void main(String[] args) {
		Time startTime = new Time(12,30,45);
		Time endTime = new Time(14,35,50);
		Concert myConcert = new Concert("New York Symphony", startTime, endTime);
		
		System.out.println(myConcert);
		
	}

} 
