package assignInterface;
//Michael Gray CSIS 1410
public class InterfaceApp {

	public static void main(String[] args) {		
		
		Shape[] shapeArray = {new Rectangle(6,3),new Rectangle(5,4), new Square(4),new Square(3),new IsoscelesRightTriangle(5),
							  new IsoscelesRightTriangle(3),new Circle(7),new Circle(2)};
		System.out.println("Shape Array: \n-----------");
		for(Shape printShape:shapeArray){
			System.out.println(printShape);
			System.out.printf("Perimeter: %.1f \nArea: %.1f \n", printShape.perimeter(), printShape.area());
			if(printShape instanceof Printable){
				((Printable)printShape).print();
			}
			System.out.println();			
		}
	}
}
