
public class module_3 {

	public static void main(String[] args) {
 
		// ���W(����)�B��l�� �e�m�� ++i(�u���B�z) or ��m�� i++ (�̫�B�z) 
		int x= 3, y = 4, z;

		z = ++x * y;
		// ++x���B�z�Ax = x + 1 �� x = 4�A��B�z z = x * y �� z = 16		
		System.out.println("x = "+ x + " y = " + y + " z = " + z);
		
		int a= 3, b = 4, c;
		c = a++*b;
		// a++����m���A�̫�B�z�A�G���B�zc(12) = a(3) * b(4); a++�ᰵ�� a = 4 
		System.out.println("a = "+ a + " b = " + b + " c = " + c);
		
		// d = d++����m���̫ᰵ �� f = d + e = 7; �ᰵ d++   
		int d= 3, e = 4, f;
		f = d+++e;
		System.out.println("d = "+ d + " e = " + e + " f = " + f);

		// g = g * ( h + 2 ) �� g = 20; h = 3
		int h = 3;
		int g = 4;
		g*=h+2;
		System.out.println("h = "+ h + " g = " + g);
		
	// �榡�ƿ�X printf
		System.out.printf("/%#o/%n",123);
		System.out.printf("/%08d/%n",123);
		System.out.printf("/%-+8d/%n",123);
		System.out.printf("%s%n","aA");
		System.out.printf("/%S/%n","asDF");
	    System.out.printf("/%-10s/%n","student");
	    System.out.printf("/%-10.4s/%n","student");
	    System.out.printf("�m�W�G%s  �~�֡G%.1f%n", "LED",30.0);
	    int sec = 566;
	    System.out.println(sec + "�� = "+ sec/60 + "�� " + sec%60 + "��");
	    System.out.printf("%d�� = %d�� %d��%n", sec, sec/60, sec%60);
	}
}
