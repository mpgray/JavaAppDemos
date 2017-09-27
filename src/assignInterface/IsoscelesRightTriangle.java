package assignInterface;


public class IsoscelesRightTriangle implements Shape,Printable {
	private int leg;

	public IsoscelesRightTriangle(int myleg){
		this.leg = myleg;
	}

	public double hypotenuse(){
		return leg * Math.sqrt(2);
	}


	/**
	 * @return the leg
	 */
	public int getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + leg + ")";
	}

	@Override
	public void print() {
		for(int count = 0; count < leg; count++){
			for(int i= 0; i < count + 1; i++){
				if(count == leg - 1 || i == 0 || i == count ){
					System.out.print("o ");
				}
				else{
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
			
	}

	@Override
	public double perimeter() {
		return (2 * leg ) + (leg * Math.sqrt(2));
	}

	@Override
	public double area() {
		return (2 * leg) / 2;
	}
	

}
