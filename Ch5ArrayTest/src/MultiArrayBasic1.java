import java.util.Iterator;

public class MultiArrayBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2차원배열
		int[][] scoreArr = {
				{
					1,2,3
				},
				{
					10,50,100
				}
		};
		
	System.out.println(scoreArr[0][2]);
	//2차원배열의 출력 for문
		for (int i = 0; i<scoreArr.length;i++) {
			for(int j=0;j<scoreArr[i].length;j++) {
				System.out.println(scoreArr[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
