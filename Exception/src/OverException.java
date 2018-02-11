
public class OverException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int inch;
	
	public OverException(int inch) {
		this.inch = inch;
		System.out.println("Exception occured! The input of inch can not over 11.");
	}

	public int getInch() {
		return inch;
	}
}
