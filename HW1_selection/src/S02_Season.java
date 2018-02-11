
public class S02_Season {

	public static void main(String[] args) {
		int month = 6;
		switch(month) {
			case 3:		case 4:		case 5:
				System.out.println(month + "月是春天");
				break;
			case 6:		case 7:		case 8:
				System.out.println(month + "月是夏天");
				break;
			case 9:		case 10:	case 11:
				System.out.println(month + "月是秋天");
				break;
			case 1:		case 2:		case 12:
				System.out.println(month + "月是冬天");
				break;
			default: System.out.println("輸入數值錯誤");
		}
	}

}
