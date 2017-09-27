package labInterface;
//Michael Gray CSIS 1410
public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		Flyable[] flyingThings = {myPlane, myHangglider, myBird};
		for(Flyable displayThings: flyingThings){
			System.out.println("\n" + displayThings);
			displayThings.launch();
			displayThings.land();
			
		}
		
	}

}
