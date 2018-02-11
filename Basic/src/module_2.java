
public class module_2 {
	public static void main(String[] args) {
/*	
		int a = 9;
    double b = 9.0;
		System.out.println(a/4);
		System.out.println(b/4);
		System.out.println(9/4);
		System.out.println(9./4);
	// 常用作法為在輸出結果時設定float即可 
		System.out.println((float)9/4);
		
		System.out.println(9%4);
		System.out.println(9%4.0);		
	
	// 合併字串
		System.out.println(a+"=a");
		System.out.println(a+b+"=a");
		System.out.println(a+"9");

	// 設變數時，少用short，建議任何數字的最小設定即int;	
	// short c = 5;
	// short d = 6;
	// short e = c + d;  e不能為short產生錯誤，無法過compiler
	// System.out.println(e);
	 
*/
// ''要小心使用，因為字元在單引號內是ascii code的序號概念
	int f = 'A';
	char g = 'A';
	char h = 'A' + 5;
	
	String ename = "peter" + '5';
	
	/* ''呼叫出A的ascii位址65，然後f的值為int。+字串後變成字串相加 659 */
	System.out.println(f+"9");
	
	/* ''呼叫出A的ascii位址65，然後g的值為int。 +數值後為數值相加 65+9 = 74 */
	System.out.println(g+9);
	
	/* ''呼叫出A的ascii位址65，9的ascii位置為57。  65+57 = 122 */
	System.out.println(g+'9');

	/* g為char、9也為char，雙方型別相同。 A+字串9 = A9 */
	System.out.println(g+"9");

	/* h為char、ascii位址65，藉由位置後延5個位置得到F */
	System.out.println(h);
	
	/* String型態 */
	System.out.println(ename);
		
	}
}
