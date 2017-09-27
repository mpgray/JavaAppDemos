package inheritance;

class Rectangle {
	private int length, height;

	public Rectangle(int mylength, int myheight) {
		this.length = mylength;
		this.height = myheight;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "Rectangle (" + length + "x" + height + ")";
	}	
}
