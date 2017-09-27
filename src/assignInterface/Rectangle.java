package assignInterface;

class Rectangle implements Shape,Printable {
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

	@Override
	public void print() {
		for(int h = height; h != 0; h--){
			for(int l = length; l != 0; l--){
				if(h == 1 || h == height || l == 1 || l == length){
					System.out.printf("o ");					
				}
				else{
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public double perimeter() {
		return 2 * (length + height);
	}

	@Override
	public double area() {
		return length * height;
	}	
}
