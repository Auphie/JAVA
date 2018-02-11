
public class Distance2 {
	private int feet, inch;
	
	public Distance2(int feet, int inch) throws OverException{
		if(inch >= 12) throw new OverException(inch);
		this.feet = feet;
		this.inch = inch;
	}

public static void main(String[] args) {
	try {
			Distance2 d1 = new Distance2(5,12);
			System.out.printf("Input distance is %d feet %d inch", d1.feet, d1.inch);
	} catch (OverException f) {
			System.out.println("Your input of inch : " + f.getInch());
		}
	}
}