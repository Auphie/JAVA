
public class OverInchException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	private int inch;
	
	public OverInchException(String msg, int inch) {
		this.msg = msg;
		this.inch = inch;
	}

	public String getMsg() {
		return msg;
	}

	public int getInch() {
		return inch;
	}
}
