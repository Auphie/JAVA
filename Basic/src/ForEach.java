
public class ForEach {

	public static void main(String[] args) {
		int sum = 0;
		int[][][] three_dim = {{{1,2,3},{4,5,6}},
							{{7,8,9},{1,2,3}},
							{{4,5,6},{7,8,9}}
							};
		for(int[][] m:three_dim)
		// 將three_dim的3 layers資料傳給 m 陣列，m 少1維度(2-D)
			for(int[] n:m)
			// 將 2-D array的 m傳 rows資料給 n, n 少1維度
				for(int o:n)
				// 將1-D array的n傳columns資料給o
					sum += o;
		System.out.println(sum);

	}

}
