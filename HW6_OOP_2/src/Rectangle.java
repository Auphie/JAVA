
public class Rectangle implements Shape{
	int x, y;
	
	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double computeArea() {
		return x * y;
	}
	
	public double computeCircumference() {
		return 2 * (x + y);
	}
}
