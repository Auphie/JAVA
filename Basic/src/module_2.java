
public class module_2 {
	public static void main(String[] args) {
/*	
		int a = 9;
    double b = 9.0;
		System.out.println(a/4);
		System.out.println(b/4);
		System.out.println(9/4);
		System.out.println(9./4);
	// �`�Χ@�k���b��X���G�ɳ]�wfloat�Y�i 
		System.out.println((float)9/4);
		
		System.out.println(9%4);
		System.out.println(9%4.0);		
	
	// �X�֦r��
		System.out.println(a+"=a");
		System.out.println(a+b+"=a");
		System.out.println(a+"9");

	// �]�ܼƮɡA�֥�short�A��ĳ����Ʀr���̤p�]�w�Yint;	
	// short c = 5;
	// short d = 6;
	// short e = c + d;  e���ରshort���Ϳ��~�A�L�k�Lcompiler
	// System.out.println(e);
	 
*/
// ''�n�p�ߨϥΡA�]���r���b��޸����Oascii code���Ǹ�����
	int f = 'A';
	char g = 'A';
	char h = 'A' + 5;
	
	String ename = "peter" + '5';
	
	/* ''�I�s�XA��ascii��}65�A�M��f���Ȭ�int�C+�r����ܦ��r��ۥ[ 659 */
	System.out.println(f+"9");
	
	/* ''�I�s�XA��ascii��}65�A�M��g���Ȭ�int�C +�ƭȫᬰ�ƭȬۥ[ 65+9 = 74 */
	System.out.println(g+9);
	
	/* ''�I�s�XA��ascii��}65�A9��ascii��m��57�C  65+57 = 122 */
	System.out.println(g+'9');

	/* g��char�B9�]��char�A���諬�O�ۦP�C A+�r��9 = A9 */
	System.out.println(g+"9");

	/* h��char�Bascii��}65�A�ǥѦ�m�᩵5�Ӧ�m�o��F */
	System.out.println(h);
	
	/* String���A */
	System.out.println(ename);
		
	}
}
