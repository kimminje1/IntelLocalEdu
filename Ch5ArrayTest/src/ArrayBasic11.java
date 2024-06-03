
public class ArrayBasic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = {90,80,60,100};
		int totalScore=0;
		double avgScore= 0;
		
		//코드 작성
		for(int i=0;i<score.length;i++) {
			totalScore+=score[i];
		}
		avgScore=totalScore/score.length;
		
		System.out.println("합계점수"+totalScore);
		System.out.println("평균점수"+avgScore);
	
		
		
		
		
	}

}
