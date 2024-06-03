
/**
 * @author PSU
 *	5개의 숫자를 배열에 입력한 후
 	배열에 담은 값을 순차적으로 출력하시오
출력예시
10
20
30
40
50
 */
public class ArrayBasic8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr = new int[45]; //1~45까지의 공
		
		for(int i=0; i<ballArr.length;i++) {
			ballArr[i]=i+1;
		} //45개 할당
		int temp = 0; //치환
		int n = 0; //인덱스접근
		for(int i=0; i<6;i++) { //0~45까지 숫자6번할당
			n=(int)(Math.random()*45); //임의의 n
			temp=ballArr[i]; 
			ballArr[i]=ballArr[n]; //1~6까지 숫자가 임의로 교체
			ballArr[n]=temp;
		}
		for(int i=0; i<6;i++) { //1~6출력
			System.out.println("["+(i+1)+"]"+""
					+ "자동으로 나온 로또번호:"+ballArr[i]);
		}
		//확인용 1~45개인지확인
/*		for(int i=0; i<ballArr.length;i++) {
			System.out.print(ballArr[i]+"");*/
		}
	}


