
public class Array3D {

	public static void main(String[] args) {
		int[][][] data3D = {									// 2 layer
						  {{2,4,5,1},{4,5,8,1},{3,4,7,1}},	// 3 rows & 4 columns	
						  {{2,4,5,2},{4,5,8,2},{3,4,7,2}}};
		int sum = 0;
		for(int i=0; i < data3D.length; i++)					// i starts from 0
			for(int j=0; j < data3D[i].length; j++)			// j starts from i[0] to i.length
				for (int k=0; k< data3D[i][j].length; k++)	// k starts from i[0]j[0].length to each layers & rows
				sum += data3D[i][j][k];
				System.out.println(sum);
	}

}
