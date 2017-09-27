package l02review;

public class Concert {

	private String name;
	private Time startTime;
	private Time endTime;
		
	public Concert(String n, Time start, Time end){	
		this.name = n;
		this.startTime = start;
		this.endTime = end;
		
	}
	
	public String toString(){
		
		return "" + name + "\n Begins at:" + startTime + "\n Ends at:" + endTime;
		
	}


}
