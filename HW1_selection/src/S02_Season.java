
public class S02_Season {

	public static void main(String[] args) {
		int month = 6;
		switch(month) {
			case 3:		case 4:		case 5:
				System.out.println(month + "��O�K��");
				break;
			case 6:		case 7:		case 8:
				System.out.println(month + "��O�L��");
				break;
			case 9:		case 10:	case 11:
				System.out.println(month + "��O���");
				break;
			case 1:		case 2:		case 12:
				System.out.println(month + "��O�V��");
				break;
			default: System.out.println("��J�ƭȿ��~");
		}
	}

}
