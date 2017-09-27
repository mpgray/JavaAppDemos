package assignInterface;
//Author: Michael Gray CSIS1410

public class InheritanceApp {

	public static void main(String[] args) {
		Rectangle myRectangle;
		Square mySquare;
		IsoscelesRightTriangle myIsoscelesRightTriangle;
		Circle myCircle;
		Rectangle rectangle2;
		Rectangle[] rectangles;
		
		myRectangle = new Rectangle(5,4);
		System.out.println(myRectangle);
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getHeight() + "\n");
		
		mySquare = new Square(4);
		System.out.println(mySquare);
		System.out.println("Side: " + mySquare.getSide() + "\n");
		
		myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		System.out.println(myIsoscelesRightTriangle);
		System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
		System.out.printf("Hypotenuse: %.1f\n\n", myIsoscelesRightTriangle.hypotenuse());
		
		myCircle = new Circle(4);
		System.out.println(myCircle);
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.printf("Circumference: %.1f\n", myCircle.circumference());
		System.out.println("Radius: " + myCircle.getRadius() + "\n");
		
		rectangle2 = mySquare;
		
		System.out.println("rectangle2:\n-----------");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getHeight() + "\n");
		
		System.out.println("Rectangle Array:\n---------------");
		rectangles = new Rectangle[] {rectangle2, mySquare, myRectangle};
		
		for(Rectangle recArray : rectangles){
			System.out.println(recArray);
			System.out.println("Length: " + recArray.getLength());
			System.out.println("Width: " + recArray.getHeight() + "\n");
		}
	}
}
