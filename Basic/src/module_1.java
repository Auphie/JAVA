
public class module_1{
// 如果在create new class時有勾選public static...的選項時，會自動帶入第5行
	public static void main(String[] args) {   

		System.out.println("Hello World 1!");

		char a = 'A';
		System.out.println("char a='A'：" + a);	
// 16進位，為ASCII code
		char b = 65;
		System.out.println("char b=65：" + b);
// 2進位，為Unicode 
		char c = '\u0041';
		System.out.println("char c='\u0041'：" + c);
// 小數的設定
		double e = 3.141592;
		System.out.println("double e = 3.141592：" + e);
		float f = 3.141592F;
		System.out.println("float f = 3.141592F：" + f);
		
// Escape字元
		/* \n 換行 */
		System.out.print("Hello");
		System.out.print(" World!\n");
		System.out.println("Hello World!");
		/* \" 顯示"" 或 \ */
		System.out.println("\"Hello World!\"");
	}

}
