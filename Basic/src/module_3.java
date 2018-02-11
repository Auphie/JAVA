
public class module_3 {

	public static void main(String[] args) {
 
		// 遞增(遞減)運算子的 前置型 ++i(優先處理) or 後置型 i++ (最後處理) 
		int x= 3, y = 4, z;

		z = ++x * y;
		// ++x先處理，x = x + 1 → x = 4，後處理 z = x * y → z = 16		
		System.out.println("x = "+ x + " y = " + y + " z = " + z);
		
		int a= 3, b = 4, c;
		c = a++*b;
		// a++為後置型，最後處理，故先處理c(12) = a(3) * b(4); a++後做後 a = 4 
		System.out.println("a = "+ a + " b = " + b + " c = " + c);
		
		// d = d++為後置型最後做 → f = d + e = 7; 後做 d++   
		int d= 3, e = 4, f;
		f = d+++e;
		System.out.println("d = "+ d + " e = " + e + " f = " + f);

		// g = g * ( h + 2 ) → g = 20; h = 3
		int h = 3;
		int g = 4;
		g*=h+2;
		System.out.println("h = "+ h + " g = " + g);
		
	// 格式化輸出 printf
		System.out.printf("/%#o/%n",123);
		System.out.printf("/%08d/%n",123);
		System.out.printf("/%-+8d/%n",123);
		System.out.printf("%s%n","aA");
		System.out.printf("/%S/%n","asDF");
	    System.out.printf("/%-10s/%n","student");
	    System.out.printf("/%-10.4s/%n","student");
	    System.out.printf("姓名：%s  年齡：%.1f%n", "LED",30.0);
	    int sec = 566;
	    System.out.println(sec + "秒 = "+ sec/60 + "分 " + sec%60 + "秒");
	    System.out.printf("%d秒 = %d分 %d秒%n", sec, sec/60, sec%60);
	}
}
