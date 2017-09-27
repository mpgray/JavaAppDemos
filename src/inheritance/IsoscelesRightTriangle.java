package inheritance;


public class IsoscelesRightTriangle {
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
	

}
