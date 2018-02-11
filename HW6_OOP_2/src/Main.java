
public class Main {

	public static void main(String[] args) {

		int x = 3, y = 5;
		double cycleArea, cycleCircumference, rectanLength, rectanArea;
		double radius = 10.0;
		
		Shape circleArea1 = new Circle(radius);
		cycleArea = circleArea1.computeArea();
		System.out.println("The area of a cycle, radius "+ radius +", is " + cycleArea);
		
		Shape circleLength = new Circle(radius);
		cycleCircumference = circleLength.computeCircumference();
		System.out.println("The Circumference of a cycle, radius "+ radius +", is " + cycleCircumference);
		
		Shape rectanArea1 = new Rectangle(x, y);
		rectanArea = rectanArea1.computeArea();
		System.out.println("The area of a rectangule, length: " + x + ", width: " + y + " is "+ rectanArea);
		
		Shape rectanLength1 = new Rectangle(x, y);
		rectanLength = rectanLength1.computeCircumference();
		System.out.println("The Circumference of a rectangule, length:" + x + ", width:" + y + " is "+rectanLength);
	}

}
