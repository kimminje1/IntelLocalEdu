package ch6.middle.exam;

import java.util.Random;

public class dicetest {
	public static void main(String[] args) {
		dice dice = new dice();
		dice dice2 = new dice();
    int[] diceRolls = new int[20];   
    int[] diceRolls2 = new int[20];
  
 
    
    }
    System.out.println("주사위 던진 결과:");
    for (int i = 0; i < diceRolls.length; i++) {
        System.out.print(diceRolls[i] + " ");
    }
    System.out.println("주사위 던진 결과:");
    for (int i = 0; i < diceRolls.length; i++) {
        System.out.print(diceRolls2[i] + " ");
    }
    
    
    int sum1 = dice.cal(diceRolls);
    int sum2 = dice.cal(diceRolls2);
    if (sum1 >= 21 && sum2 >= 21) {
        System.out.println("둘 다 21 이상이므로 비겼습니다.");
    } else if (sum1 >= 21) {
        System.out.println("주사위 1이 승리하셨습니다!");
    } else if (sum2 >= 21) {
        System.out.println("주사위 2가 승리하셨습니다!");
    } else {
        System.out.println("아직 승자가 없습니다.");
    }	
		
		
		
		
		
	}

//ctrl+shift+f 블럭정렬

}
