
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
public class ArrayBasic6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr=new int[5];
		
		for(int i=0;i<5;i++){
			numArr[i]=(i+1)*10;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(numArr[i]);
		}

		
		
		
		
		
		
		
	

	}

}
