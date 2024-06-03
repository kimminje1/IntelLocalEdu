
public class ArrayBasic10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] jumsuArr = {
			100,88,87,100,77,77
		}; 
		for(int i=0; i<jumsuArr.length;i++) {
			System.out.print(jumsuArr[i]+" ");
			}
		System.out.println();
		//총점
		int jumsuAll=0;
		for(int i=0;i<jumsuArr.length;i++) {
			jumsuAll+=jumsuArr[i];
		}
		System.out.println("총점은:"+jumsuAll);
		//평균
		double jumsuMean=0;
		jumsuMean=(double)jumsuAll/jumsuArr.length;
		System.out.println("평균은:"+jumsuMean);
		/*
		 * jumsuMean = Math.round(jumsuMean * 1000.0) / 1000.0;
		 * 
		 * System.out.println("평균은: " + jumsuMean);
		 */
		int intPart = (int) (jumsuMean * 1000);
	    int decimalPart = intPart % 10;
	    
	    if (decimalPart >= 5) {
	        // 소수점 셋째 자리에서 반올림
	    	intPart += 1;
	    }
	    else {
	    	intPart -= 1;
	    }
	   jumsuMean=(double)intPart/1000;
	
	    System.out.println(intPart);
	    System.out.printf("-평균은:%.2f",jumsuMean);
	   
		
    
      
   

	
		}
	}


