
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2= new int[10];
		//코드작성
		for(int i=0; i<num.length;i++) {
			num2[i]+=num[i]*num[i] ;
		}
		//num2 출력
		for (int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
	}

}
