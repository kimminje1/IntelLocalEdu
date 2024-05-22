
public class ArrayBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열(Array)
		//같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
		//배열의 길이와 인덱스
		//인덱스(index)의 범위는 0부터 배열길이 -1까지이다.
		
//		ex:double[] doubleNum=new doublep[7];
//		이라면 7이 배열의 길이다
//		즉 0부터 시작이니 7-1=>6이기때문에
//		0~6까지의 값이 []안에 작성 가능하다
		
		
		int a1 =1;
		int a2 =2;
		int a3 =3;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("===========================");
		int[] numArr=new int[3];
		
	
		//0으로초기화
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[5]);
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
	
	
		
	}

}
