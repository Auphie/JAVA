
public class Distance {
	private int feet, inch;
	
	public Distance(int feet, int inch) throws OverInchException{
		if(inch >= 12) throw new OverInchException("Exception occured! The input of inch is over 11.", inch);
		this.feet = feet;
		this.inch = inch;
	}

public static void main(String[] args) {
	try {
			Distance d1 = new Distance(5,12);
			System.out.printf("Input distance is %d feet %d inch", d1.feet, d1.inch);
	} catch (OverInchException e) {
			System.out.println(e.getMsg());
			System.out.println("Your input of inch : " + e.getInch());
		}
	}
}