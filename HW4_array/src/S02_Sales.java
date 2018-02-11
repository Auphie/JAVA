
public class S02_Sales {

	static String translateNo(int n) {
		String name;
		if(n==0) name = "A";
		else if(n==1) name = "B";
		else if(n==2) name = "C";
		else if(n==3) name = "D";
		else name = "E";
		return name;
	}
	
	static void findTopSales(int[] agent) {
		int maxSales = agent[0];
		int i;
		int man;
		for (i = 0; i < agent.length; i++) {
			if (agent[i] > maxSales)
				maxSales = agent[i];
			}
		if(agent[0] == maxSales)
			man = 1;
		else if(agent[1] == maxSales)
			man = 2;
		else man = 3;
		System.out.println("最佳銷售員為" + man + ", 銷售額為$：" + maxSales);
	}
	
	static void findTopProducts(int[] products) {
		int maxSales = products[0];
		int i;
		String prod;
		for (i = 0; i < products.length; i++) {
			if (products[i] > maxSales)
				maxSales = products[i];
			}
		if(products[0] == maxSales)
			prod = translateNo(0);
		else if(products[1] == maxSales)
			prod = translateNo(1);
		else if(products[2] == maxSales)
			prod = translateNo(2);
		else if(products[3] == maxSales)
			prod = translateNo(3);
		else prod = translateNo(4);
		System.out.println("最佳產品為 產品" + prod + ", 銷售額為$：" + maxSales);
	}
	
	public static void main(String[] args) {
		int[][] salesQty = new int[][] {{33,77,43},{32,33,55},{56,68,43},{45,45,67},{33,23,65}};
		int[] unitPrice = {12,16,10,14,15};
		int[][]salesAmt = new int [5][3];

	//  Translate array of product sales_qty into sales_amt
		for(int i=0; i< salesQty.length; i++)
			for(int j=0; j< salesQty[0].length ;j++)
				{ salesAmt[i][j] = salesQty[i][j] * unitPrice[i];
				}
		
	//  To sum up product sales
		for(int i=0; i<salesQty.length; i++) {
			int prodSales = 0;
			String name;
			for(int j=0; j< salesQty[0].length; j++)
			{ prodSales += salesAmt[i][j];
			}
			name = translateNo(i);
		System.out.println("產品" + name +"的總銷售額為$" +prodSales);
		}

	//  To sum up Agent sales
		for(int i=0; i<salesQty[0].length; i++) {
			int agentSales = 0;
			for(int j=0; j< salesQty.length; j++)
			{ agentSales += salesAmt[j][i];
			}
		System.out.println("業務員" +(i+1)+"的總銷售額為$" +agentSales);
		}

	// Find Top sales
		int[] agentSales = new int[3];
		for(int i=0; i<salesQty[0].length; i++) {
			for(int j=0; j< salesQty.length; j++)
				agentSales[i] += salesAmt[j][i];
				}
			findTopSales(agentSales);	
		
	// Find Top products
		int[] productSales = new int[5];
		for(int i=0; i<salesQty.length; i++) {
			for(int j=0; j< salesQty[0].length; j++)
				productSales[i] += salesAmt[i][j];
				}
			findTopProducts(productSales);
	}
}