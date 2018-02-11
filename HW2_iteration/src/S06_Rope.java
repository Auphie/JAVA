
public class S06_Rope {

	public static void main(String[] args) {
		float ropeLength = 3000;
		int cutDays=0;
		
		do {ropeLength = ropeLength/2;
			cutDays ++;
			}
		while(ropeLength > 5);
		System.out.println(cutDays);
		System.out.println(ropeLength);
	}
}
