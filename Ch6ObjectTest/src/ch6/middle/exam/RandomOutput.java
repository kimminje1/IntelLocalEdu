package ch6.middle.exam;

public class RandomOutput {
	 public static void main(String[] args) {
	        // "아"와 "따"를 저장한 배열 생성
	        String[] choices = {"아", "따"};
	        
	        // 10번 반복하여 "아" 또는 "따"를 랜덤하게 출력
	        for (int i = 0; i < 10; i++) {
	            // 배열의 인덱스를 랜덤하게 선택
	            int randomIndex = (int) (Math.random() * choices.length);
	            
	            // 랜덤하게 선택된 값을 출력
	            System.out.print("아"+choices[randomIndex]);
	        }
	    }
	}

