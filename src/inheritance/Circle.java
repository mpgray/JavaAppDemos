package inheritance;

public class Circle {
	private int radius;
	
	public Circle(int myradius){
		this.radius = myradius;
	}
	
	public int diameter(){
		return radius * 2;
	}
	public double circumference(){
		return 2 * Math.PI * radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Circle(" + radius + ")";
	}
	
}
