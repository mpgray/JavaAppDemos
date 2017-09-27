package assignInterface;

public class Square extends Rectangle implements Shape,Printable {

	private int side;

	public Square(int myside) {
		super(myside, myside);
		this.side = myside;
	}


	public int getSide() {
		return side;
	}	
	
	
	@Override
	public String toString() {
		return "Square (" + side + ")";
	}

}


