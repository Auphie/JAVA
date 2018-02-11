
public class Circle implements Shape{
	double r;
	
	public Circle(double r) {
	super();
	this.r = r;
	}

	public double computeArea() {
		return Shape.PI * r * r;
	}
	
	public double computeCircumference() {
		return 2 * Shape.PI * r;
	}
}
