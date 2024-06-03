
public class ArrayBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열(Array)
		//같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
		System.out.println("===========================");
		int[] numArr=new int[5]; //자바

		for(int i=0;i<5;i++) {
			numArr[i]=(i+1)*2;
			System.out.print(numArr[i]+"\t");
		}
//		기본값-다른 값에 영향을 주지 않는 값으로 설정 n
//		new int-0 char ''공백 boolean falsse 실수0.0 string-null
// 		컴파일 오류->코드에서 빨간색이 뜨는 것
// 		런타임 오류->실행에서 오류가 나는 것->수행은 되는데 실행x

		
		
		
	
	
		
	}

}
