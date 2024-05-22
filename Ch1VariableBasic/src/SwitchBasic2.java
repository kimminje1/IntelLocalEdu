import java.util.Scanner;
public class SwitchBasic2 {
public static void main(String[] args) {

	
	
	String mothStr="";
	System.out.println("월을 입력하세요");
	Scanner scan=new Scanner(System.in);
	int month =scan.nextInt();
	//최신버전은 case 3,4,5도 된다
	switch (month) {
	case 3: case 4: case 5: //이런 방식도 된다.
		mothStr ="봄";
				break;
	case 6: case 7: case 8:
		mothStr ="여름";
				break;
	case 9: case 10: case 11:
		mothStr ="가을";
				break;
	case 12: case 1: case 2:
		mothStr ="겨울";
				break;
	default:
		mothStr ="특이한 계절";
		break;
	}
	System.out.println("계절:"+mothStr);

	}
	
	
	
	
	
	
	
}

