package assignInterface;

public class Circle implements Shape {
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

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius,2);
	}
	
}
