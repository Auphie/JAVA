
public class StackFullException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	int num;
	
	public StackFullException() {
		
	}
	
	public StackFullException(String msg, int num) {
		this.msg = msg;
		this.num = num;
	}
}
