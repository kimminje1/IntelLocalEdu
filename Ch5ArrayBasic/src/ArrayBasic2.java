
public class ArrayBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열(Array)
		//같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		int kroean1 =10;
		int kroean2 =20;
		int kroean3 =30;
		int kroean4 =40;
		int kroean5 =50;
		System.out.println("국어점수는:"+kroean1);
		System.out.println("국어점수는:"+kroean2);
		System.out.println("국어점수는:"+kroean3);
		System.out.println("국어점수는:"+kroean4);
		System.out.println("국어점수는:"+kroean5);
		
		System.out.println("===========================");
		int[] numArr=new int[5]; //자바
		int numArr2[] =new int[5]; //c언어방식
	
		for(int i=0;i<5;i++) {
			numArr[i]=(i+1)*10;
		}
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번 국어점수"+numArr[i]);
		}
		
		
		
	
	
		
	}

}
