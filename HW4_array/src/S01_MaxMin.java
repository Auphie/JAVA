
public class S01_MaxMin {

	static int findMin(int[] y) {
		int isMin = y[0];
		for (int i = 0; i < y.length; i++) {
		if(y[i] < isMin)
			isMin = y[i];
		}
	return isMin;
	}

	static int findMax(int[] x) {
		int isMax = x[0];
		
		for (int i = 0; i < x.length; i++) {
			if(x[i] > isMax)
				isMax = x[i];
		}
		return isMax;
	}
	
	public static void main(String[] args) {
		int[] a = {22,3,563,2,64,6,8,7,20,10};
		
		int Max = findMax(a);
		int min = findMin(a);
		System.out.println("最大值是：" + Max);
		System.out.println("最小值是：" + min);
	}
}