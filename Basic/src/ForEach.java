
public class ForEach {

	public static void main(String[] args) {
		int sum = 0;
		int[][][] three_dim = {{{1,2,3},{4,5,6}},
							{{7,8,9},{1,2,3}},
							{{4,5,6},{7,8,9}}
							};
		for(int[][] m:three_dim)
		// �Nthree_dim��3 layers��ƶǵ� m �}�C�Am ��1����(2-D)
			for(int[] n:m)
			// �N 2-D array�� m�� rows��Ƶ� n, n ��1����
				for(int o:n)
				// �N1-D array��n��columns��Ƶ�o
					sum += o;
		System.out.println(sum);

	}

}
