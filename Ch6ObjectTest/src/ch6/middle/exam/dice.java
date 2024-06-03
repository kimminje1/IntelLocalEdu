package ch6.middle.exam;

import java.util.Random;

public class dice {


	static int roll() {
		int result=(int)(Math.random()*6+1);
		System.out.println("주사위를 굴려"+result+"가 나왔습니다");
		return result;
		
		
	}

	static int cal(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
		
		
	}
	
	
	
	
}

